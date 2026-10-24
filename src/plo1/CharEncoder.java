package plo1;

import java.io.FileInputStream;
import java.io.IOException;

public class CharEncoder {
	public static String detectEncoding(String fileName) throws IOException {

		byte[] bom = new byte[4];

		try (FileInputStream fis = new FileInputStream(fileName)) {
			int bytesRead = fis.read(bom);

			if (bytesRead >= 4) {
				if ((bom[0] & 0xFF) == 0x00 && (bom[1] & 0xFF) == 0x00 && (bom[2] & 0xFF) == 0xFE
						&& (bom[3] & 0xFF) == 0xFF) {
					return "UTF-32 BE";
				}

				if ((bom[0] & 0xFF) == 0xFF && (bom[1] & 0xFF) == 0xFE && (bom[2] & 0xFF) == 0x00
						&& (bom[3] & 0xFF) == 0x00) {
					return "UTF-32 LE";
				}
			}

			if (bytesRead >= 3 && (bom[0] & 0xFF) == 0xEF && (bom[1] & 0xFF) == 0xBB && (bom[2] & 0xFF) == 0xBF) {
				return "UTF-8";
			}

			if (bytesRead >= 2) {
				if ((bom[0] & 0xFF) == 0xFE && (bom[1] & 0xFF) == 0xFF) {
					return "UTF-16 BE";
				}

				if ((bom[0] & 0xFF) == 0xFF && (bom[1] & 0xFF) == 0xFE) {
					return "UTF-16 LE";
				}
			}
		}

		return "No BOM found; encoding cannot be determined";
	}

	public static void main(String[] args) {
		String fileName = "src/plo1/sample.txt";

		try {
			String encoding = detectEncoding(fileName);
			System.out.println("Character Encoding: " + encoding);
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}

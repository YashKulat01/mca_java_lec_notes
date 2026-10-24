package plo1;


import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateUTF8BOM {
    public static void main(String[] args) throws Exception {

        Path file = Path.of("C:/Users/hp/Desktop/GIT/mca_java_lec_notes/src/plo1/sample.txt");

        // UTF-8 BOM bytes
        byte[] bom = {
            (byte) 0xEF,
            (byte) 0xBB,
            (byte) 0xBF
        };

        // Text content encoded in UTF-8
        byte[] content = "Hello World!\nWelcome to Java."
                .getBytes(StandardCharsets.UTF_8);

        // Write BOM first, then the text
        try (OutputStream out = Files.newOutputStream(file)) {
            out.write(bom);
            out.write(content);
        }

        System.out.println("File created with UTF-8 BOM.");
    }
}

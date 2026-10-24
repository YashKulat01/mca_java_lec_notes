package plo4;

//WAP using Lambda Expression to calculate following:
//a) Convert Fahrenheit to Celsius
//b) Convert Kilometers to Meters

@FunctionalInterface
interface FtoC {
	double convert(double temp);
}

@FunctionalInterface
interface KmToM {
	double convert(double temp);
}

public class Program3 {
	public static void main(String[] args) {
		System.out.println("Program 3:\n");

//		1)
		FtoC ftoC = temp -> ((temp - 32) * 5 / 9);

		System.out.println("°F to °C: " + ftoC.convert(98.6) + "°C");

//		2)
		KmToM kmToM = temp -> temp * 1000;

		System.out.println("Km to m: " + kmToM.convert(3) + "m");
	}
}

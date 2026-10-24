package plo4;
/*
 * WAP using Lambda Expression with multiple parameters to
	print addition of two numbers
 */

@FunctionalInterface
interface Addition {
	int sum(int a, int b);
}

public class Program2 {
	public static void main(String[] args) {

		System.out.println("*** Lambda Expression in java ***");
		Addition sum = (a, b) -> a + b;
		System.out.println("Result: " +sum.sum(4, 2) );
	}
}

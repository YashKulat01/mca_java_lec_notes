package plo3;

import java.util.ArrayList;
import java.util.ListIterator;

public class Program1 {
	public static void main(String[] args) {

// PROGRAM 1: 
// 		WRITE A JAVA PROGRAM TO CREATE LIST CONTAINING LIST OF ITEMS 
//		AND USE - LISTITERATOR INTERFACE TO PRINT ITEMS PRESENT 
//		IN THE LIST. ALSO PRINT THE LIST IN REVERSE/ BACKWARD DIRECTION.
		
		System.out.println("*** Program 1 ***\n");
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(0);
		arrayList.add(1);
		arrayList.add(2);
		
		ListIterator<Integer> li = arrayList.listIterator();
		
		System.out.println("Traversing in forward direction:");
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("\nTraversing in reverse direction:");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}

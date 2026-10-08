package plo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Program2 {
	public static void main(String[] args) {
		
// PROGRAM 2: 
/*
 * 			WRITE A JAVA PROGRAM TO CREATE A SET CONTAINING LIST OF 
 * 			ITEMS OF TYPE STRING AND PRINT THE ITEMS IN THE LIST USING 
 * 			THE ITERATOR INTERFACE. ALSO PRINT THE LIST IN REVERSE/
 * 			BACKWARD DIRECTION
 */
		
		System.out.println("*** Program 3 ***\n");
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Angular");
		set.add("React");
		set.add("NodeJs");
		
		Iterator<String> iterator = set.iterator();
		
		System.out.println("Traverse in forward direction:");
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		System.out.println("\nTraverse in Reverse direction:");
		
		ArrayList<String> arrayList = new ArrayList<String>(set);
		Collections.reverse(arrayList);
		
		
		for (String string : arrayList) {
			System.out.println(string);
		}
		
	}
}

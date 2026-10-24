package plo4;

import java.util.HashMap;

/*
 * 
 * Write a Java program using Map interface containing list 
 * of items having keys and associated values and perform the 
 * following operations: 
		a. Add items in the map.
		b. Remove items from the map. 
		c. Search specific key from the map.
		d. Get value of the specified key.
		e. Insert map elements of one map into another map. 
		f. Print all keys and values of the map.
 */
public class Program1 {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();

//		1) Add items in the map.
		map.put(1, "AA");
		map.put(2, "AB");
		map.put(3, "AC");
		map.put(4, "AD");
		map.put(5, "AE");

		System.out.println("\nElements added: " + map);

//		2) Remove items from map.
		map.remove(5);
		System.out.println("\nElements after removed: " + map);

//		3) Search for specific key:
		System.out.println("\nElement found: " + map.containsKey(1));

//		4) Get value of the specific key:
		System.out.println("\nValue of key: " + map.get(3));

//		5) Insert map elements of one map into another map.
		map.putAll(map1);

//		6) Print all keys and values of the map.
		System.out.println("\nAll values of map1");
		for (HashMap.Entry<Integer, String> elem : map.entrySet()) {
			System.out.println("Key: " + elem.getKey() + " | " + "Value: " + elem.getValue());
		}
	}
}

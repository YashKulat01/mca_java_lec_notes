package dsa.stacks;

import java.util.Scanner;

/*
 * A Stack is a linear data structure that follows the LIFO/FILO
 * (Last In, First Out/ First In, Last Out) principle.
 * 
 * The insertion/deletion of elements will starts from top of stack.
 * 
 * The last element inserted last will be removed first.
 * 
 * Operations:
 * 			1) push(): Insert an element| Time complexity: O(1)
 * 			2) pop(): Removes the top element|  Time complexity: O(1)
 * 			3) peek(): Get the top element|  Time complexity: O(1)
 * 			4) isEmpty(): Check whether stack is empty| Time complexity: O(1)
 * 			5) size(): Return number of elements;
 * 
 * Types: 
 * 		1) Static Stack: Stack with fixed size, generally implemented
 * 						 using an array;
 * 		2) Dynamic Stack: Stack that can grow or shrink dynamically,
 * 						  generally implemented using a linked list.
 * 
 * Adv: 
 * 		1) Easy to implement;
 * 		2) Insertion and deletion are fast;
 * 		3) Useful for managing function calls;
 * 		4) Helpful in expression evaluation;
 * 		5) Useful in backtracking
 * 
 * Disadv:
 * 		1) Only top element is directly accessible;
 * 		2) Array implementation has a fixed capacity;
 * 		3) Searching takes O(n) time;
 * 		4) Stack overflow can occur when capacity is exceeded;
 * 
 * Applications:
 * 		Undo and Redo operations.
 * 		Browser Back button.
 * 		Function calls and recursion.
 * 		Expression evaluation.
 * 		Parentheses matching.
 * 		Reversing strings.
 * 		Depth First Search (DFS).
 */

public class Stackss {
	Scanner scanner = new Scanner(System.in);

	private int top, c = 0;
	int s[] = new int[10];

	public Stackss() {
		top = -1;
	}

	public void push() {

		if (top == s.length - 1)
			System.out.println("Stack is overflow !!");
		else {
			System.out.println("Enter the elements: ");
			int val = scanner.nextInt();
			top = top + 1;
			s[top] = val;
		}
	}

	public void pop() {
		if (top == -1)
			System.out.println("Stack is underflow");
		else {
			System.out.println("Popped element is:" + s[top]);
			top = top - 1;
		}
	}

	public void isFull() {
		if (top == s.length) {
			System.out.println("Stack is overflowed");
		} else {
			System.out.println("Stack is not overflowed.");
		}
	}

	public void isEmpty() {
		if (top == -1) {
			System.out.println("Stack is underflow");
		} else {
			System.out.println("Stack is not underflowed.");
		}
	}

	public void count() {
		if (top == -1)
			c = 0;
		else {
			for (int i = top; i > -1; i--)
				c++;
		}
		System.out.println("Number of elements in stack are:" + c);
	}

	public void display() {
		int i;
		System.out.println("Elements in stack are:");
		for (i = top; i >= 0; i--)
			System.out.println(s[i] + " ");
	}

	public void showTop() {
		if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + s[top]);
        }
	}

	public static void main(String[] args) {
		System.out.println("*** Stack in Data Structure With Java ***");

		Scanner scanner = new Scanner(System.in);
		Stackss stackss = new Stackss();

		int ch;

		do {
			System.out.println("Enter choice:");
			System.out.println("1:push");
			System.out.println("2:pop");
			System.out.println("3:isFull");
			System.out.println("4:isEmpty");
			System.out.println("5:count");
			System.out.println("6:display");
			System.out.println("7:topElement");
			System.out.println("8:exit");
			ch = scanner.nextInt();

			switch (ch) {
			case 1:
				stackss.push();
				break;
			case 2:
				stackss.pop();
				break;
			case 3:
				stackss.isFull();
				break;
			case 4:
				stackss.isEmpty();
				break;
			case 5:
				stackss.count();
				break;
			case 6:
				stackss.display();
				break;
			case 7: 
				stackss.showTop();
				break;
			case 8:
				System.exit(0);
				break;
			default:
				break;
			}
		} while (ch != 7);

		scanner.close();
	}

}

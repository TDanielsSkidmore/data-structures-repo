package structuresTest;

import structures.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		Stack testStack = new Stack("1");
		testStack.push("2");
		testStack.push("3");
		testStack.push("4");
		System.out.println(testStack);
		testStack.pop();
		testStack.pop();
		System.out.println(testStack);
		System.out.println(testStack.peek());
	}

}

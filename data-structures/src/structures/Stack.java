package structures;

public class Stack {
	// stack implemented with a linked list
	private LinkedList stack;
	//  constructor for a stack must be passed data
	public Stack(String data) {
		// TODO Auto-generated constructor stub
		stack = new LinkedList(data);
	}
	// add a node to the end of the stack FILO
	public void push(String data) {
		stack.addToEnd(data);
	}
	// remove a node from the stack FILO
	public void pop() {
		stack.removeLast();
	}
	// look at the next data in the stack
	public String peek() {
		return stack.getEnd();
	}
	// 
	public String toString() {
		return stack.toString();
	}

}

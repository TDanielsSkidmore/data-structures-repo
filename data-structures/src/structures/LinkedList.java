package structures;
//created by Troy Daniels
public class LinkedList {
	//keep track of the first node
	private Node root = null;
	//keep track of the last node
	private Node tail = null;
	
	// constructor implemented so that data needs to be passed
	public LinkedList(String data) {
		Node n = new Node(data);
		this.root = n;
		this.tail = n;
	}
	// will add a node to the end of the LL
	public void addToEnd(String data) {
		if (isEmpty()) {
			Node n = new Node(data);
			this.root = n;
			this.tail = n;
		}
		else {
			Node n = new Node(data);
			this.tail.next = n;
			this.tail = n;
		}
	}
	// Removes the last Node in the LL
	public void removeLast() {
		if (isEmpty()) {
			System.out.println("Linked List is empty, function did not happen");
		}
		else if(this.root==this.tail) {
			this.root = null;
			this.tail=null;
		}
		else {
			Node currentNode = this.root;
			while(currentNode.next.next!=null) {
				currentNode = currentNode.next;
			}
			currentNode.next=null;
			this.tail=currentNode;
		}
	}
	// Will add a node to the Start of the LL
	public void addToStart(String data) {
		if (isEmpty()) {
			Node n = new Node(data);
			this.root = n;
			this.tail = n;
		}
		else {
			Node n = new Node(data);
			n.next = this.root;
			this.root = n;
		}
	}
	// Removes a node from the Start
	public void removeStart() {
		if (isEmpty()) {
			System.out.println("Linked List is empty, function did not happen");
		}
		else if(this.root==this.tail) {
			this.root = null;
			this.tail=null;
		}
		else {
			this.root= this.root.next;
		}
	}
	// Pass in the data you want to be removed. If in LL it will be removed (only the first one if multiple)
	public void remove(String dataToRemove) {
		if (isEmpty()) {
			System.out.println("Linked List is empty, function did not happen");
		}
		else if(this.root==this.tail) {
			this.root = null;
			this.tail=null;
		}
		else {
			Node currentNode = this.root;
			while(currentNode.next!=null && currentNode.next.data!=dataToRemove) {
				currentNode = currentNode.next;
			}
			if (currentNode.next!=null) {
				currentNode.next = currentNode.next.next;
			}
			else {
				System.out.println("Node to insert after was not found, data not entered");
			}
		}
	}
	// pass in the data you want inserted and then the data is should be inserted after. (will always be first match)
	public void insertAfter(String dataToInsert, String insertAfter) {
		if (isEmpty()) {
			System.out.println("Linked List is empty, function did not happen");
		}
		else {
			Node nodeToInsert = new Node(dataToInsert);
			Node currentNode = this.root;
			while(currentNode!=null && currentNode.data!=insertAfter) {
				currentNode = currentNode.next;
			}
			if (currentNode!=null) {
				nodeToInsert.next = currentNode.next;
				currentNode.next = nodeToInsert;
			}
			else {
				System.out.println("Node to insert after was not found, data not entered");
			}
			
		}
		
	}
	// pass in the data you want inserted and then the data is should be inserted before. (will always be first match)
	public void insertBefore(String dataToInsert, String insertBefore) {
		if (isEmpty()) {
			System.out.println("Linked List is empty, function did not happen");
		}
		else {
			Node nodeToInsert = new Node(dataToInsert);
			Node currentNode = this.root;
			while(currentNode.next!=null && currentNode.next.data!=insertBefore) {
				currentNode = currentNode.next;
			}
			if (currentNode.next!=null) {
				nodeToInsert.next = currentNode.next;
				currentNode.next = nodeToInsert;
			}
			else {
				System.out.println("Node to insert after was not found, data not entered");
			}
			
		}
	}
	// gets the last data in LL
	public String getEnd() {
		if (isEmpty()) {
			System.out.println("Linked List is empty, function did not happen");
			return "";
		}
		else {
			return this.tail.data;
		}
	}
	// gets first data in LL
	public String getStart() {
		if (isEmpty()) {
			System.out.println("Linked List is empty, function did not happen");
			return "";
		}
		else {
			return this.root.data;
		}
	}
	// checks if LL has no nodes
	public boolean isEmpty() {
		if (root == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// prints out the entire LL in order
	public String toString() {
		String stringToReturn = "";
		Node currentNode = this.root;
		while(currentNode!=null) {
			stringToReturn+=currentNode.data+",";
			currentNode = currentNode.next;
		}
		return stringToReturn.substring(0, stringToReturn.length()-1);
	}
}



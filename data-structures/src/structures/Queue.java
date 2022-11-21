package structures;

public class Queue {
	// linked list implemented as queue
	private LinkedList queue;
	// constructor, needs to be passed data
	public Queue(String data) {
		queue = new LinkedList(data);
	}
	// to add a node to the queue FIFO
	public void queue(String data) {
		this.queue.addToEnd(data);
	}
	//remove the node from the queue FIFO
	public void dequeue() {
		this.queue.removeStart();
	}
	// look at the data next in the queue
	public String peek() {
		return queue.getStart();
	}
	// to string to print the whole queue
	public String toString() {
		return queue.toString();
	}
}

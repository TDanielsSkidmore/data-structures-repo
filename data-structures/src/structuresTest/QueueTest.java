package structuresTest;

import structures.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue queue = new Queue("1");
		queue.queue("2");
		queue.queue("3");
		queue.queue("4");
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		System.out.println(queue.peek());
	}
}

package structuresTest;
import structures.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList testList = new LinkedList("2");
		testList.addToEnd("5");
		testList.addToStart("1");
		testList.insertAfter("3", "2");
		testList.insertBefore("4", "5");
		System.out.println(testList);
		testList.removeLast();
		testList.removeStart();
		testList.remove("3");
		System.out.println(testList);
		testList.removeLast();
		testList.removeLast();
		testList.insertBefore("4", "5");
	}

}

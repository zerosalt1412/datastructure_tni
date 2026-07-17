
public class NumberLinkedList {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.insert(0,37);
		numbers.insert(0,7);
		numbers.insert(0,4);
		numbers.insert(0,16);
		System.out.println(numbers.traversal());
		
		numbers.insert(0,20);
		System.out.println(numbers.traversal());
		numbers.insert(0,25);
		System.out.println(numbers.traversal());
		numbers.remove(0);
		System.out.println(numbers.traversal());
		numbers.remove(2);
		System.out.println(numbers.traversal());
		
		numbers.removeLastElement();
		System.out.println(numbers.traversal());

		
	}

}

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class TraverseBFS {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree3();    // Try to test with createTree2() and createTree3()
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Postorder = " + traversal(tree.getRoot()));
	}
	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Queue<Node> queue = new ArrayDeque<Node>();
		queue.add(node);
		while (!queue.isEmpty()) {
		int levelSize = queue.size();
			for (int i = 0; i < levelSize; i++) {
				Node current = queue.poll();

				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
				list.add(current.data);
			}
		}
		return list;
	}

}

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class TraversePreorder {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree3           ();
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Preorder = " + traversal(tree.getRoot()));
	}

	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (node == null) return list;

		Deque<Node> stack = new ArrayDeque<Node>();
		stack.push(node);

		while(!stack.isEmpty()) {
			Node current_node = stack.pop();
			list.add(current_node.data);

			if (current_node.right != null) {
				stack.push(current_node.right);
			}
			if (current_node.left != null) {
				stack.push(current_node.left);
			}
		}
		return list;
	}

}
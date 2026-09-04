import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class TreeHeight {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree2();    
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Height of tree (DFS) = " + heightDFS(tree.getRoot()));
		System.out.println("Height of tree (BFS) = " + heightBFS(tree.getRoot()));
	}
	
	public static int heightDFS(Node node) {
		if (node == null) return 0;

		Deque<Node> stack_node = new ArrayDeque<Node>(); 
		Deque<Integer> stack_depth = new ArrayDeque<Integer>();
		int maxHeight = 0;
		
		stack_node.push(node);
		stack_depth.push(1);

		while (!stack_node.isEmpty()) {
			Node current = stack_node.pop();
			int currentDepth = stack_depth.pop();
			maxHeight = Math.max(currentDepth, maxHeight);

			if (current.left != null) {
				stack_node.push(current.left);
				stack_depth.push(currentDepth + 1);
			}

			if (current.right != null) {
				stack_node.push(current.right);
				stack_depth.push(currentDepth + 1);
			}
		}

		return maxHeight - 1;
	}
	
	public static int heightBFS(Node node) {
		if (node == null) return 0;
		
		int height = 0;
		Queue<Node> queue = new ArrayDeque<Node>();
		queue.add(node);
		
		while (!queue.isEmpty()) {
			height++;
			int levelSize = queue.size();

			for (int i = 0; i < levelSize; i++) {
				Node current = queue.poll();

				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
			}
		}

		return height - 1;
	}
}
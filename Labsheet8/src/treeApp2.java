
public class treeApp2 {
	public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        System.out.println("------------------------------");
        System.out.println("Binary Tree from createTree4()");
        System.out.println("------------------------------");
        tree.createTree4();
        tree.printTree(tree.getRoot(),0);
        System.out.println();
     
        
      
        BinaryTree tree2 = new BinaryTree();
        System.out.println("------------------------------");
        System.out.println("Binary Tree from createTree5()");
        System.out.println("------------------------------");
        tree2.createTree5();
        tree2.printTree(tree2.getRoot(),0);
        
        System.out.println();
        tree2.searchDeleteNode(25);
     
	}
}

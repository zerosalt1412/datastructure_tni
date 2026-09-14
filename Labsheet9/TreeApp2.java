package Labsheet9;

public class TreeApp2 {

    public static void main(String[] args) {



        System.out.println("------------------------------------------------");
        System.out.println("Binary Tree from createTree5()");
        System.out.println("------------------------------------------------");
        BinaryTree tree1 = new BinaryTree();
        tree1.createTree5();
        tree1.printTree(tree1.getRoot(), 0);

        System.out.println("------------------------------------------------");
        System.out.println("Binary Tree from createTree6()");
        System.out.println("------------------------------------------------");
        BinaryTree tree2 = new BinaryTree();
        tree2.createTree6();
        tree2.printTree(tree2.getRoot(), 0);

    }

}
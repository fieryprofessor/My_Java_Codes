import java.util.Scanner;

public class BinaryTree {
    
    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
    
    private Node root;

    public BinaryTree() {
        root = null;
    }

    //insert elements
    public void populate(Scanner sc) {
        System.out.println("Enter the root node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value at the left of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value at the right of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void display() {
        display(this.root, "");
    }

    private void display(Node node , String indent){
        if(node==null){
            return;
        }

        System.out.println(indent + node.value);
        display(node.left , indent + "\t");
        display(node.right , indent + "\t");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
    }
}
package ds;

class BTNode {
    public int data;
    public BTNode left = null;
    public BTNode right = null;

    public BTNode(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    public static void main(String args[]) {
        BTNode root = new BTNode(100);
        root.left = new BTNode(1);
        root.right = new BTNode(200);
        root.left.left = new BTNode(10);
    }
}

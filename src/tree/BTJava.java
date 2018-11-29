package tree;

class BTJava {

    public static void main(String[] arg) {
        BinaryTree tree = new BinaryTree();

        Node start = new Node(20, null, null);

        tree.add(null, start);

        tree.search(20, start);

    }

}

class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    public void add(Node start, Node newNode) {
        if (root == null) {
            root = newNode;
            return;
        }

        if (newNode.value > start.value) {
            if (start.right == null) {
                start.right = newNode;
            }

            add(start.right, newNode);
        }

        if (newNode.value < start.value) {
            if (start.left == null) {
                start.left = newNode;
            }

            add(start.left, newNode);
        }

    }

    public void search(int value, Node start) {

        if (start == null) {
            throw new RuntimeException("Node not find");
        }

        if (start.value == value)
            System.out.println("Search Found " + value);

        if (value > start.value) {
            search(value, start.right);
        }

        if (value > start.value) {
            search(value, start.left);
        }

    }
}

class Node {

    int value;
    Node left;
    Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
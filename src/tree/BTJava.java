package tree;

class BTJava {

    public static void main(String[] arg) {
        BinaryTree tree = new BinaryTree();

        tree.add(tree.root, tree.nodeCreate(5));
        tree.add(tree.root, tree.nodeCreate(10));
        tree.add(tree.root, tree.nodeCreate(12));
        tree.add(tree.root, tree.nodeCreate(11));
        tree.add(tree.root, tree.nodeCreate(7));
        tree.add(tree.root, tree.nodeCreate(8));


        tree.search(10, tree.root);
    }

    private static class BinaryTree {

        Node root;

        BinaryTree() {
            root = null;
        }

        Node nodeCreate(int value) {
            return new Node(value, null, null);
        }

        public void add(Node start, Node newNode) {
            if (root == null) {
                root = newNode;
                return;
            }

            if (newNode.value > start.value) {
                if (start.right == null) {
                    start.right = newNode;
                    return;
                }

                add(start.right, newNode);
            }

            if (newNode.value < start.value) {
                if (start.left == null) {
                    start.left = newNode;
                    return;
                }

                add(start.left, newNode);
            }

        }

        void search(int value, Node start) {

            if (start == null) {
                System.out.println("Node not find");
                return;
            }

            if (start.value == value) {
                System.out.println("Search Found " + value);
                return;
            }

            if (value > start.value) {
                search(value, start.right);
            }

            if (value > start.value) {
                search(value, start.left);
            }

        }
    }

    private static class Node {

        int value;
        Node left;
        Node right;

        Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}
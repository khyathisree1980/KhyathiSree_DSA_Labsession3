package completebrackettree;

public class Node {
    int value;
    Node left;
    Node right;

    static Node newnode(int data) {
        Node temp = new Node();
        temp.value = data;
        temp.right = null;
        temp.left = null;
        return temp;
    }

    public Node insert(Node root, int value) {
        if (root == null)
            return newnode(value);

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root; // Return the updated root
    }

    public void inOrderTraversal() {
        inOrderTraversal(this);
    }

    public static void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.value + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        Node node = new Node();

        root = node.insert(root, 40);
        root = node.insert(root, 20);
        root = node.insert(root, 60);
        root = node.insert(root, 10);
        root = node.insert(root, 30);
        root = node.insert(root, 50);
        root = node.insert(root, 70);
        
        // Print the tree using in-order traversal
        root.inOrderTraversal();
    }
}

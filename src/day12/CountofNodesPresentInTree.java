package day12;


class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class CountofNodesPresentInTree {

    Node root;

    // Insert a node
    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Inorder Traversal
    void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder Traversal
    void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder Traversal
    void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {

        CountofNodesPresentInTree bst = new CountofNodesPresentInTree();

        int arr[] = {50, 30, 70, 20, 40, 60, 80};

        for (int num : arr) {
            bst.root = bst.insert(bst.root, num);
        }

        System.out.print("Inorder: ");
        bst.inorder(bst.root);

        System.out.print("\nPreorder: ");
        bst.preorder(bst.root);

        System.out.print("\nPostorder: ");
        bst.postorder(bst.root);

        System.out.println("\nCount of Nodes in the Tree: " + bst.countNodes(bst.root));
    }
}


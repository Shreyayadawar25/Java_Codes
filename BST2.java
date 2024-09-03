package DataStructure;
import java.util.AbstractList;
import java.util.ArrayList;

public class BST2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        inOrder(root.left, inorder);
        inorder.add(root.data);
        inOrder(root.right, inorder);
    }

    // CREATE BALANCED BST
    public static Node createBalancedBST(int arr[], int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBalancedBST(arr, st, mid - 1);
        root.right = createBalancedBST(arr, mid + 1, end);
        return root;
    }

    // CONVERT BST TO BALANCED BST
    public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid - 1);
        root.right = createBST(inorder, mid + 1, end);
        return root;
    }
/*for creating Balanced BST from BST then 
we need a sorted array and sorted array gets by inorder Traversal */
    public static Node BalancedBST(Node root) {
        // inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        inOrder(root, inorder);

        // sorted inorder => balanced BST
        root = createBST(inorder, 0, inorder.size() - 1);
        return root;

    }

    // Size of largest BST IN BT
    static class info {
        boolean isBST;
        int size;
        int min;
        int max;

        public info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;

        }
    }

    public static int maxBST = 0;

    public static info largestBST(Node root) {
        if (root == null) {
            return new info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        info leftInfo = largestBST(root.left);
        info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
 
        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new info(false, size, min, max);
        }

        if (leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new info(true, size, min, max);
        }
 
        return new info(false, size, min, max);
    }

    // MERGE BST
    public static Node mergeBST(Node root1, Node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        inOrder(root1, arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        inOrder(root2, arr2);

        // merge
        int i = 0;
        int j = 0;
        ArrayList<Integer> finalARR = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalARR.add(arr1.get(i));
                i++;
            } else {
                finalARR.add(arr2.get(j));
                j++;
            }
        }

        while (i < arr1.size()) {
            finalARR.add(arr1.get(i));
            i++;
        }
        while (j < arr1.size()) {
            finalARR.add(arr2.get(j));
            j++;
        }

        //sorted Al => balanced BST
        return  createBST(finalARR, 0, finalARR.size()-1);

    }

    public static void main(String[] args) {
        // int arr[] = {3,5,6,8,10,11,12};
        // Node root = createBalancedBST(arr, 0, arr.length-1);
        // preOrder(root);

        // Balanced BST
        // Node root = new Node(8);
        // root.left = new Node(6);
        // root.right = new Node(10);
        // root.left.left = new Node(5);
        // root.left.left.left = new Node(3);
        // root.right.right = new Node(11);
        // root.right.right.right = new Node(12);

        // root = BalancedBST(root);
        // preOrder(root);

        // Size of largest BST IN BT
        // Node root = new Node(50);
        // root.left = new Node(30);
        // root.left.left = new Node(5);
        // root.left.right = new Node(20);
        // root.right = new Node(60);
        // root.right.left = new Node(45);
        // root.right.right = new Node(70);
        // root.right.right.right = new Node(80);
        // root.right.right.left = new Node(65);

        // info info = largestBST(root);
        // System.out.println("Largest BST size= "+maxBST);

        // MERGE TWO BST
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        Node root = mergeBST(root1, root2);
        preOrder(root);

    }

}

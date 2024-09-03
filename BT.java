package DataStructure;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.HashMap;

public class BT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }

        public static void preOrder(Node root) {  //DFS
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inorder(Node root) {//DFS
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postOrder(Node root) { //DFS
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }

        public static void levelOrder(Node root) {  //BFS
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }

        }

    }

    // public static int heigth(Node root) {
    //     if (root == null) {
    //         return 0;
    //     }
    //     int lh = heigth(root.left);
    //     int rh = heigth(root.right);
    //     return Math.max(lh, rh) + 1;

    // }

    // public static int count(Node root) {
    //     if (root == null) {
    //         return 0;
    //     }
    //     int lh = count(root.left);
    //     int rh = count(root.right);
    //     return lh + rh + 1;

    // }

    // public static int SumOfNodes(Node root) {
    //     if (root == null) {
    //         return 0;
    //     }
    //     int lh = SumOfNodes(root.left);
    //     int rh = SumOfNodes(root.right);
    //     return lh + rh + root.data;

    // }

    // // diameter of a tree == No. of nodes in the longest path between 2 leaves
    // public static int diameter(Node root) { //o(n^2)
    //     if (root == null) {
    //         return 0;
    //     }

    //     int leftDia = diameter(root.left);
    //     int lh = heigth(root.left);
    //     int rightDia = diameter(root.right);
    //     int rh = heigth(root.right);

    //     int selfDia = lh + rh + 1;

    //     return Math.max(selfDia, Math.max(rightDia, leftDia));

    // }

    // public static boolean isIdentical(Node node, Node subRoot) {
    //     if (node == null && subRoot == null) {
    //         return true;
    //     } else if (node == null || subRoot == null || node.data != subRoot.data) {
    //         return false;
    //     }

    //     if (!isIdentical(node.left, subRoot.left)) {
    //         return false;
    //     }
    //     if (!isIdentical(node.right, subRoot.right)) {
    //         return false;
    //     }
    //     return true;
    // }

    // Subtree==Given the roots of two binary trees root and subroot,
    // return true if there is a subtree of root with the same structure and node
    // values of
    // subroot and false otherwise.
    // public static boolean isSubtree(Node root, Node subRoot) {
    //     if (root == null) {
    //         return false;
    //     }
    //     if (root.data == subRoot.data) {
    //         if (isIdentical(root, subRoot)) {
    //             return true;
    //         }
    //     }
    //     return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    // }

    static class Information {
        Node node;
        int hd; 

        public Information(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        // level order
        Queue<Information> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0;
        int max = 0;
        q.add(new Information(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Information curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }

            else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Information(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new Information(curr.node.right, curr.hd + 1));
                    min = Math.max(max, curr.hd + 1);
                }
            }

        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data+" ");
        } 
        System.out.println();
    }

    public static void main(String[] args) {
        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // Binarytree tree = new Binarytree();
        //  Node root = tree.buildTree(nodes);
       // tree.preOrder(root);
        // tree.inorder(root);
        // tree.postOrder(root);
       // tree.levelOrder(root);

        // --------------------------------------------------------
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.right = new Node(5);
        // //System.out.println(heigth(root));
        // //System.out.println(count(root));
        // // System.out.println(SumOfNodes(root));
        //  System.out.println(diameter(root));

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);
        // System.out.println(isSubtree(root, subRoot));

       topView(root);

    }

}

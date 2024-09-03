package DataStructure;
import java.util.ArrayList;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left= this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // leftsubtree insert
            root.left = insert(root.left, val);
        } else {
            // rightsubtree insert
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root== null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static boolean search(Node root,int key){  //o)(H)
        if(root== null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);

        }
        else{
            return search(root.right, key);
        }
    }
 
    public static Node delete(Node root,int val){
        if (root == null) {
            return null;
        }
        if(root.data < val){
            root.right = delete(root.right, val);

        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            //case1 - leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            //case2 - single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3- both child
            Node IS = findInordersucceccor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInordersucceccor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRAnge(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRAnge(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRAnge(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRAnge(root.left, k1, k2);
        }
        else{
            printInRAnge(root.right, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0 ; i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println("NUll");

    }

    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root== null){return;}
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }
/*valid bst condition to check
 * Approach 1 = compare with left and right node and inorder traversal should from small to large
 * Approach 2 = check if max value in left subtree < node and min value in right subtree > node
 *  
 */
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);

    }


    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }
         Node leftMirror = createMirror(root.left);
         Node rightMirror = createMirror(root.right);

         root.left = rightMirror;
         root.right = leftMirror;
         return root;


    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        int values[] = { 8,5,3,6,10,11,14 };
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

        // if(search(root, 8)){
        //     System.out.println("found");
        // }
        // else{
        //     System.out.println("NOt found");
        // }


        //DELETE THE NODE-----------------
    //    root =  delete(root, 1);
    //     System.out.println();

    //     inOrder(root);


        //print in range
        //printInRAnge(root, 5, 12);

        // //printRoot2Leaf
        // printRoot2Leaf(root, new ArrayList<>());

        //validity if BST
        // if(isValidBST(root, null, null)){
        //     System.out.println("valid");
        // }else{
        //     System.out.println("Not valid");
        // }


        //create mirror
        root = createMirror(root);
        preOrder(root);

    }
}

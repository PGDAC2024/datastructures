package Assignment4.q3;

public class BST {
     static class Node{
    	private int data;
    	private  Node left;
    	private Node right;
    	 
    	 public Node(int data) {
		    this.data=data;
		}
     }
     private Node root;
     public BST() {
		root = null;
	}
     public boolean IsEmpty() {
    	 return root == null;
     }
     
     public void add(int value) {
    	 root = add(root,value);
     }
     private Node add(Node root,int value) {
    	 if(root==null) {
    		 return new Node(value);
    	 }
    	 
    	 if(value<root.data) {
    		 root.left = add(root.left,value);
    	 }
    	 else {
    		 root.right= add(root.right,value);
    	 }
    	 return root;
     }
     
     
     private void inorderTraversal(Node root) {
         if (root != null) {
             inorderTraversal(root.left);
             System.out.print(root.data + " ");
             inorderTraversal(root.right);
         }
     }

     // Method to print inorder traversal of BST
     public void inorder() {
         inorderTraversal(root);
         System.out.println();
     }
}

package Assignment5.q3;

import java.lang.reflect.Array;

public class Bst {
    private static class Node{
    	int data;
    	Node left;
    	Node right;
    	
    	public Node(int value) {
		   data = value;
		   left=right=null;
		}
    } 
    Node root;
    int count;
    public Bst() {
	   root = null;
	}
    public void addNode(int value) {
    	root = addNode(root,value);
    }
    private Node addNode(Node root, int value) {
    	if(root == null) {
    	  	return new Node(value);
    	}
    	 if(root.data > value) {
    		 root.left = addNode(root.left,value);
    	 }
    	 else {
    		 root.right = addNode(root.right,value);
    	 }
    	return root;
    }
    private void Inorder(Node root) {
    	if(root!= null) {
    		Inorder(root.left);
    		System.out.print(root.data + " ");
    		Inorder(root.right);
    	}
    }
    public void Inorder() {
        Inorder(root);
        System.out.println();
    }
    private Node[] searchparent(int key){
    	Node parent = null;
    	Node child = root;
    	while(child != null) {
    		if(child.data == key)
    			break;
    		parent = child;
    		
    		if(child.data<key) {
    			child = child.left;
    		}else {
    			child = child.right;
    		}
    	}if(child==null) {
    		parent=null;
    	}
    	return new Node[]{child,parent};
    }
    public void deleteNode(int key) {
          Node temp[] = searchparent(key);
          Node child = temp[0];
          Node parent = temp[1];
          
          if(child==null) {
        	  return;
          }
          if(child.left != null && child.right != null) {
        	  Node success = child.right;
        	  parent = child;
        	  while(success.left != null) {
        		  parent = success;
        		  success = success.left;
        	  }
        	  child.data = success.data;
        	  child = success;
          }
          if(child.left==null) 
          {
        	  if(child == root)
  				root = child.right;
  			else if(child == parent.left)
  				parent.left = child.right;
  			else if(child == parent.right)
  				parent.right = child.right;
          }else {
        	  if(temp == root)
  				root = temp.left;
  			else if(temp == parent.left)
  				parent.left = temp.left;
  			else if(temp == parent.right)
  				parent.right = temp.left;
          }
    }
}

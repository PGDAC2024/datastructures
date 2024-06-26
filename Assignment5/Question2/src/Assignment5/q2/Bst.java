package Assignment5.q2;

public class Bst {
    static private class Node{
    	int data;
    	Node left;
    	Node right;
    	
    	public Node(int value) {
			 data = value;
			 left=null;
			 right= null;
		} 
    }
    Node root;
    int count;
    public Bst() {
	     root = null;
	     count=0;
	}
    
    private Node addNode(Node root , int value) {
    	count++;
    	if(root == null) {
    		return new Node(value);
    	}
    	
    	if(value <root.data) {
    		root.left = addNode(root.left,value);
    	}
    	else {
    		root.right = addNode(root.right,value);
    	}
    	return root;
    }
    
    public void addNode(int value) {
    	root =  addNode(root,value);
    }
    private void Inorder(Node root) {
    	if(root!=null) {
    		Inorder(root.left);
        	System.out.print(root.data + " ");
        	Inorder(root.right);
    	}
    }
    
    public void Inorder() {
    	Inorder(root);
    	System.out.println();
    }
    
    private boolean search(Node root , int key) {
    	if(root == null) {
    		return false;
    	}
    	if(root.data == key) {
    		return true;
    	}
    	else {
    		if(root.data > key) {
    			return search(root.left,key);
    		}
    		else {
    			return search(root.right,key);
    		}
    	}
    	
    }
    public boolean search(int key){
    	return search(root,key);
    }
}

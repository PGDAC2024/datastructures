package Assignment5.q2;

public class Bstmain {

	public static void main(String[] args) {
		Bst tree = new Bst();
		tree.addNode(3);
		tree.addNode(4);
		tree.addNode(5);
		tree.addNode(6);
		tree.addNode(7);
		tree.addNode(8);
		tree.addNode(9);
		
		tree.Inorder();
		System.out.println(tree.search(7));
		System.out.println(tree.search(10));

	}

}

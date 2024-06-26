package Assignment2.q2;


class List{
	static class Node{
		int data;
		Node next;
		public Node(int data) {		
			this.data = data;
			next=null;
		}
	}
	Node head;
	int count;
	public List() {
		this.head = null;
		this.count = 0;
	}
	public boolean isEmpty() 
	{
	    return head == null;	
	}
	public void deleteAll() {
		head=null;
		count=0;
	}
	public void size() {
		System.out.println(count);
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		else {
			Node trav=head;
			while(trav!=null) {
				System.out.print(trav.data + " ");
				trav = trav.next;
			}
			System.out.println();
		}
		
	}
	public void addFirst(int value) {
		Node n1 = new Node(value);
		if(isEmpty()) {
			head = n1;
		}else {
			n1.next=head;
			head=n1;
		}
		count ++;
	}
	public void addLast(int value) {
		Node n1 = new Node(value);
		if(isEmpty()) {
			head=n1;
		}
		else {
			Node Trav = head;
			while(Trav.next != null) {
				Trav=Trav.next;
			}
			Trav.next=n1;
		}
		count++;
	}
	public void inserAfter(int value , int position) {
		if(position<1 || position > count+1) {
			System.out.println("invalid position");
			return;
		}else if(position==1) {
			addFirst(value);
		}else {
			Node trav = head;
			for (int i = 0; i < position-1; i++) {
				trav = trav.next;
			}
			Node n = new Node(value);
			n.next = trav.next;
			trav.next=n;
		
			count++;
		}
		
	}
	public void inserBefore(int value , int position) {
		if(position<1 || position > count+1) {
			System.out.println("invalid position");
			return;
		}else if(position==1) {
			addFirst(value);
		}else {
			Node trav = head;
			for (int i = 0; i < position-2; i++) {
				trav = trav.next;
			}
			Node n = new Node(value);
			n.next = trav.next;
			trav.next=n;
		
			count++;
		}
		
	}
}

public class q2 {

	public static void main(String[] args) {
	    
		 List l1 = new List();
		 l1.addFirst(3);
		 l1.addFirst(2);
		 l1.addFirst(1);
		 l1.addLast(4);
		 l1.addLast(5);
		 l1.addLast(6);
		 l1.inserAfter(7,6);
		 l1.inserBefore(7,6);
		 l1.display();
		 l1.size();

	}

}

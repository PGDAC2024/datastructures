package Assignment3.q1;
class List{
	static class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			next=null;
		}
	}
	private Node tail;
	private int count;
	public List() {
		
		this.tail = null ;
		count=0;
	}
	
	
	public void size() {
		System.out.println("No of elements :" +count);
	}
	public boolean isEmpty() {
		return tail==null;
	}
	public void deleteAll() {
		tail = null;
		count =0;
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		else {
			Node trav = tail;
			do {
				trav = trav.next;
				System.out.print(trav.data);
				System.out.print(" ");
			}while(trav != tail);
			System.out.println();
		}
	}
	public  void addfirst(int value) {
		Node n = new Node(value);
	     if(isEmpty()) {
	    	 tail=n;
	    	 n.next=tail;
	     }
	     else {
	    	 n.next = tail.next;
	    	 tail.next=n;
	     }
	     count++;
	}
	public void addLast(int value) {
		Node n = new  Node(value);
		if(isEmpty()) {
	    	 tail=n;
	    	 n.next=tail;
	     }
		else {
			n.next = tail.next;
			tail.next = n;
			tail=n;
		}
		count++;
	}
	
	public void deleteFirst() {
		if(isEmpty()) {
			System.out.println("List is already empty");
		}else if(tail.next == tail) {
			tail = null;
		}else {
			tail.next = tail.next.next;
		}
		count--;
	}
	
	public void deleteLast() {
		if(isEmpty()) {
			System.out.println("List is already empty");
		}else if(tail.next == tail) {
			tail = null;
		}else {
			Node trav = tail;
			do {
				trav=trav.next;
			}while(trav.next != tail);
		    
			trav.next = tail.next;
			tail = trav;
		}
		count--;
	}
	
	public void addPosition(int value , int position) {
		if(position<1 || position > count+1) {
			System.out.println("invalid position");
			return;
		}else if(position==1) {
			addfirst(value);
		}else {
			Node trav = tail;
			for (int i = 0; i < position-1; i++) {
				trav = trav.next;
			}
			Node n = new Node(value);
			n.next = trav.next;
			trav.next=n;
			if(trav==tail) {
				tail=n;
			}
			count++;
		}
		
	}
	public void deletePosition(int position) {
		if(position< 1 || position > count) {
			System.out.println("invalid position");
			return;
		}else if(position==1) {
			deleteFirst();
		}else {
			Node trav = tail;
			for (int i = 0; i < position-1; i++) {
				trav = trav.next;
			}
			
			if(trav.next==tail) {
				tail=trav;
			}
			trav.next=trav.next.next;
			
			count--;
		}
		
	}
}
public class SinglyCircularLinkedList {

	public static void main(String[] args) {
		List l1 = new List();
		l1.addfirst(4);
		l1.addfirst(2);
		l1.addfirst(1);
    	l1.addLast(6);
		l1.addLast(7);
		l1.addLast(8);
//		l1.deleteFirst();
//		l1.deleteFirst();
//		l1.deleteLast();
//		l1.deleteLast();
		//l1.deleteAll();
		l1.addPosition(3, 3);
		l1.addPosition(0, 1);
		l1.addPosition(5, 5);
		l1.addPosition(9,10);
		l1.deletePosition(1);
	    l1.deletePosition(9);
	    l1.deletePosition(8);
		l1.display();
        l1.size();
	}

}

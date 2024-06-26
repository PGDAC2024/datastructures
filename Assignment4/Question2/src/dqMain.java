
public class dqMain {

	public static void main(String[] args) {
		/*
		 * List l1 = new List();
		 * 
		 * l1.addFirst(1); l1.addFirst(1); l1.addFirst(1); l1.addFirst(1);
		 * l1.addFirst(1); l1.deleteFirst();
		 * 
		 * l1.addLast(2); l1.addFirst(1); l1.addLast(1); l1.addLast(3); l1.addLast(4);
		 * l1.addLast(5); l1.deleteFirst(); l1.deleteLast() ;
		 * l1.display("list is empty");
		 */
		Deque q1= new Deque();
		q1.addFirst(1);
		q1.addFirst(2);
		q1.addFirst(3);
		q1.addFirst(4);
		q1.addFirst(5);
		q1.addFirst(6);
		q1.addFirst(7);
		q1.addLast(2);
		q1.addLast(3);
		q1.addLast(4);
		q1.addLast(5);
		q1.addLast(6);
		q1.addLast(7);
		q1.addLast(3);
	q1.display();
	 System.out.println(q1.deleteFirst());  
	 System.out.println(q1.deleteLast());
	 q1.display();
	 
	}

}

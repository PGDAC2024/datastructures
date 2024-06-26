import java.util.NoSuchElementException;

class List {
    static class Node {
        Node prev;
        Node next;
        int data;

        public Node(int value) {
            data = value;
            next = prev = null;
        }
    }

    Node head;
    Node tail;
    int count;

    public List() {
        head = tail = null;
        count = 0;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void addFirst(int value) {
        Node n = new Node(value);
        if (isEmpty()) {
            head = tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
        count++;
    }

    public int deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        int data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null; // If head is null, tail should also be null
        }
        count--;
        return data;
    }

    public void addLast(int value) {
        Node n = new Node(value);
        if (isEmpty()) {
            head = tail = n;
        } else {
            n.prev = tail;
            tail.next = n;
            tail = n;
        }
        count++;
    }

    public int deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        int data = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null; // If tail is null, head should also be null
        }
        count--;
        return data;
    }

    public int PeekFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        return head.data;
    }

    public int PeekLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        return tail.data;
    }

    public void display(String s) {
        if (isEmpty()) {
            System.out.println(s);
            return;
        } else {
            Node trav = head;
            while (trav != null) {
                System.out.print(trav.data + " ");
                trav = trav.next;
            }
            System.out.println();
        }
    }
}



public class Deque {
         List l1 ;
         public Deque() {
		    l1= new List();
		}
       public void addFirst(int value) {
    	   l1.addFirst(value);
       }
       public void addLast(int value) {
    	   l1.addLast(value);
       }
       
       public int deleteFirst() {
    		int deleted =l1.deleteFirst();
    		return deleted;
       }
       public int deleteLast() {
    	   int deleted = l1.deleteLast();
    	   return deleted;
       }
       public int peekFirst() 
       {
    	   return l1.PeekFirst();
       }
       public int peekLast() {
    	   return l1.PeekLast();
       }
       public void display() {
    	   l1.display("Queue is Empty !");
       }
       public boolean IsEmpty() {
    	   return l1.isEmpty();
       }
     
   }

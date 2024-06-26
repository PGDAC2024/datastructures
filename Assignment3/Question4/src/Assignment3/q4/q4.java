package Assignment3.q4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

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
	public int size() {
		return count;
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
}
public class q4 {
	public static List sortedInsert(int...numbers){
		List l1= new List();
		Arrays.sort(numbers);
		for (int i : numbers) {
			l1.addLast(i);
		}
		return l1;
	}
     
	public static void main(String[] args) {
	   List l1 = sortedInsert(8,9,1,0,13,55,22,11); 
	   l1.display();
	}
}

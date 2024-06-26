package Assignment4.q1;

import java.util.LinkedList;

public class stack {
    LinkedList<Integer> data ;
    
    public stack() {
		data = new LinkedList<Integer>();
	    
	}
    public void push(int value) {
    	data.addLast(value);
    }
    public int pop() {
    	return data.pollLast();
    }
    public int peek() 
    {
    	return data.peek();
    }
    public boolean isEmpty() 
    {
    	return data.isEmpty();
    }
    public void display() {
    	System.out.println(data.toString());
    }
}
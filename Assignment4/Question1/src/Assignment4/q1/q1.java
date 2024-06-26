package Assignment4.q1;

public class q1 {

	public static void main(String[] args) {
		stack s1 = new stack();
		System.out.println(s1.isEmpty());
		s1.push(3);
		s1.push(21);
		s1.push(30);
		s1.push(12);
		s1.pop();
		System.out.println(s1.peek());
		s1.display();
		
        queue q1 = new queue();
        System.out.println(q1.isEmpty());
		q1.push(3);
		q1.push(21);
		q1.push(30);
		q1.push(12);
		q1.pop();
		System.out.println(q1.peek());
		q1.display();
		
	}

}

package test4;

import java.util.LinkedList;
class stack{
	LinkedList<Integer> list=new LinkedList<>();
	void push(int e) {
		list.addLast( e);
	}
	int pop() {
		int x=list.getLast();
		list.removeLast();
		return x;
		
	}
	public stack() {
		// TODO Auto-generated constructor stub
	}
}

class queue{
	LinkedList<Integer> list=new LinkedList<>();
	void push(int e) {
		list.addLast( e);
	}
	int pop() {
		int x=list.getFirst();
		list.removeFirst();
		return x;
		
	}
	
}
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedListDemo demo=new LinkedListDemo();
		stack s1 = new stack();
		s1.push(1);
		s1.push(2);
		s1.push(0);
		System.out.print(s1.pop());
		System.out.print(s1.pop());
		queue q1=new queue();
		q1.push(1);
		q1.push(2);
		System.out.print(q1.pop());
		System.out.print(q1.pop());
	}

}

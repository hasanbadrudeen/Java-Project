package com.pack;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack<String> stack = new Stack<String>();
//		stack.push("A");
//		stack.push("B");
//		stack.push("C");
//		System.out.println(stack);
////		System.out.println(stack.pop());
////		System.out.println(stack);
//		System.out.println(stack.peek());
//		System.out.println(stack);
		
		
		
		
//		
//		PriorityQueue<String> queue = new PriorityQueue<String>();
//		queue.offer("A");
//		queue.offer("X");
//		queue.offer("B");
//		queue.offer("C");
//		queue.offer("Z");
//		queue.offer("S");
//		System.out.println(queue);
//		System.out.println(queue.poll());
//		
		
		ArrayDeque<String> deque = new ArrayDeque<String>();
		deque.offer("A");
		deque.offer("B");
		deque.offer("C");
		deque.offerLast("Z");
		deque.offerFirst("X");
		
		System.out.println(deque);
		System.out.println(deque.poll());
		System.out.println(deque.pollLast());
		
		
		
		
		
		
		
	}

}

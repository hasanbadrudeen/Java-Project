package com.threads;


class PriorityThread extends Thread{
	public void run() {
//		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class ThreadPriority {
	public static void main(String args[]) {
		for(int i=1;i<=10;i++) {
			
			
			PriorityThread p1 = new PriorityThread();
			p1.start();
			p1.setPriority(i);
		}
		
		
	
		
		
		
//		PriorityThread p2 = new PriorityThread();
//		p2.start();
//		p2.setPriority(Thread.MIN_PRIORITY);
		
		
		
		
		
		
		
		
		
		
//		System.out.println(p.getState());
	}
	
	
}

package com.threads;
import java.util.concurrent.atomic.*;


class Counter {
	private int count = 0 ;
	
	public synchronized  void increaseCount() {
		count++;
	}
	
	public synchronized  int getCount() {
		return count;
	}
	
	class AtomicCounter{
		AtomicInteger  count = new AtomicInteger(0);
	}
	
}

public class SynchronizedThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		
		Thread t1 = new Thread(() -> {
			for(int i = 0 ; i < 5000 ; i++) {
				c.increaseCount();
			}
		}) ;
	
		
		Thread t2 = new Thread(() -> {
			for(int i = 0 ; i < 5000 ; i++) {
				c.increaseCount();
			}
		}) ;
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		System.out.println(c.getCount());
	}

}

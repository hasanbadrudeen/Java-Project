package com.threads;

public class InterruptThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(()->{
			try {
				Thread.sleep(3000);
				System.out.println("Hasan");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("interrupted");
			}
			
		});
		t1.start();
		
		
//		t1.interrupt();
		
	}

}

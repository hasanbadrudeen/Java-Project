package com.threads;

public class ThreadCommuntication {
	private final Object lock = new Object();
	
	public void pauseThread() throws InterruptedException {
		synchronized(lock) {
			System.out.println("Thread waiting ");
			lock.wait();
		}
	}
	
    public void resumeThread() {
    	synchronized(lock) {
			System.out.println("Thread resumed ");
//			lock.notify();
			System.out.println("allowing thread to waiting ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCommuntication tc= new ThreadCommuntication();
		
		Thread t1 = new Thread(()->{
			try {
				tc.pauseThread();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception on wait");
			}
		});

		Thread t2 = new Thread(()->{
			try {
				Thread.sleep(3000);
				tc.resumeThread();
				
			}catch(Exception e) {
				System.out.println("Exception on wait");
			}
		});
		
		t1.start();
		t2.start();
		
		
		
		
		
		
		
		
	}

}

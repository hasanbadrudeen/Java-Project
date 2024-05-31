package com.threads;

class ThreadOne implements Runnable{
	public void run() {
		System.out.println("Hello");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
//
//
//
//
//
//class Book implements Runnable{
//public void run (){
//		for(int i = 1 ; i<=5 ; i++) {
//			System.out.println("update DB");
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}
//class Num extends Thread{
//	public void run() {
//		for(int i = 1 ; i<=5 ; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	
//		}
//		
//	}
//}
class SleepingThread extends Thread{
	public void run() {
		for(int i=0;i<6;i++) {
			try {
				Thread.sleep(3000);
				System.out.println("Sleeping thread" + Thread.currentThread().getId());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}









public class MultiThread {
	
	
	public static void main(String args[]) throws InterruptedException {
//		Runnable book = new Book();
//		Num num = new Num();
//		
//		
//		Thread t1 = new Thread(book);
//		
//		t1.setName("book1");
//		System.out.println(t1.getName());
//		
//		t1.start();
//		
////		book.updateDB();
//		num.start();
		
//		for(int i = 1 ;i < 5 ; i++) {
//			ThreadOne tOne = new ThreadOne();
//			Thread t = new Thread(tOne);
//			t.start();
//		}
		
		SleepingThread t = new SleepingThread();
		t.start();
		
		
		
		
		
		
//		if(book.isAlive()) {
//			System.out.println("Executing");
//		}
		
//		book.join();
//		num.join();
//		if(!book.isAlive()) {
//			System.out.println(" not Executing");
//		}
		
//		System.out.println("Bye");
		
	}
}

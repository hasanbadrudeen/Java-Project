package com.threads;

public class ThreadYield {
	public static void main(String args[]) {
		Thread t1 = new Thread(()->{
			System.out.println("Hasan");
			Thread.yield();
		}) ;
		Thread t2 = new Thread(()->{
			System.out.println("Hasan");
			Thread.yield();
		}) ;
		Thread t3 = new Thread(()->{
			System.out.println("Hasan");
			Thread.yield();
		}) ;
			t1.start();
			t2.start();
			t3.start();
	}
}

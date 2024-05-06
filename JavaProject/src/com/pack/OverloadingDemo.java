package com.pack;

public class OverloadingDemo {
	static int max (int a , int b) {
		return a>b?a:b;
	}
	
	
	static double max (double a , double b) {
		return a>b?a:b;
	}
	
	
	public static void main(String args[]) {
		System.out.println(max(2,7));
		System.out.println(max(2.4,7.7));
		
		
	}
}

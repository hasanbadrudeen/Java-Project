package com.pack;

public class PassingRefDemo {
	
	static void increment(int a){
		a++;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		increment(a);
		System.out.print(a);
	}

}

}

package com.pack;  

class parent{
	int a ;
	void display() {
	System.out.println("parent");
	}
}
class child extends parent{
	int b ;
	void show() {
	System.out.println("Child");
	}
	
}

	public class Inherit2 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			child c = new child();
			c.show();
		}

	}

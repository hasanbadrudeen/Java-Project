package com.pack;


abstract class Member{
	private String name;
	abstract void welcomeMsg();
}


class Student extends Member{
	
	void welcomeMessage() {
		System.out.println("Hello Student");
	}
}
class Teacher extends Member{
	
	void welcomeMessage() {
		System.out.println("Hello Teacher");
	}
}



public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1 = new Teacher();
		t1.welcomeMessage();
	}

}

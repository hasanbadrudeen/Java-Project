package com.pack;

public class Child1 extends Parents {
	void takeCar() {
		System.out.println("Car Riding");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 ch = new Child1();
		System.out.println(ch.amount);
		ch.takeBike();
		ch.takeCar();
	}

}

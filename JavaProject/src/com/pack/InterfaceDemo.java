package com.pack;

interface ridable{
	 void ride();
	default void display() {
		 System.out.println("Hello from ridable interface");
	 }
}

class Car implements ridable{
	public void ride() {
		System.out.println("You are riding a car ");
	}
}

class Bike implements ridable{
	public void ride() {
		System.out.println("You are riding a bike ");
	}
}


class Mechanic{
	void check(ridable r) {
		System.out.println("checking");
		r.ride();
	}
	
}



public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mechanic m = new Mechanic();
		Car c = new Car();
		m.check(c);
		
		Bike b = new Bike();
		m.check(b);
		
		ridable r = new Car();
		c.display();
		
		ridable r3 = () -> System.out.println("Lambda expression");
		r3.ride();
		
		
	}

}

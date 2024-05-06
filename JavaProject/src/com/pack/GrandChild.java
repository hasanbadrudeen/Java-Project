package com.pack;

public class GrandChild extends Child1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		GrandChild gc = new GrandChild() ;
		System.out.println(gc.amount);
		gc.takeBike();
		gc.takeCar();
	}

}

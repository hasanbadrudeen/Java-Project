package com.pack;

enum Level{
	BEGINNER("B"),INTERMEDIATE("I"),ADVANCED("A");
	private String abbr;
	Level(String ab){
		abbr = ab;
	}
	String getAbbr(){
		return abbr;
	}
}


public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level l1 = Level.ADVANCED;
		
		System.out.println(l1.toString());
		System.out.print(l1.getAbbr());
	}

}

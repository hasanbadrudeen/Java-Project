package com.pack;



class cycle{
	void display(){
		System.out.println("Iam a cycle");
}
}

//class Tricycle extends cycle{
//	void display(){
//		System.out.println("Iam a Tricycle");
//}
//}

public class AnonymousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cycle c = new cycle() {
			
		
		void display(){
			System.out.println("Iam a Tricycle");
	}
		};
		
		c.display();
	}
	

}

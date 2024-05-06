package com.pack;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a first number");
		 a =  scanner.nextInt();
		
		System.out.println("Enter a second number");
		b = scanner.nextInt();
		
		char operator;
		System.out.println("Enter the operator + - * / %");
		operator = scanner.next().charAt(0);
		
		
		switch(operator) {
		
		case '+' :
			System.out.println(a + "+" + b + "=" + (a+b));
			break;
		case '-' :
			System.out.println(a + "-" + b + "=" + (a-b));
			break;
		case '*' :
			System.out.println(a + "*" + b + "=" + (a*b));
			break;
		case '/' :
			System.out.println(a + "/" + b + "=" + (a/b));	
			break;
		case '%' :
			System.out.println(a + "%" + b + "=" + (a%b));	
			break;
			
		default:
			System.out.println("You entered a wrong operator");
	}

}
}

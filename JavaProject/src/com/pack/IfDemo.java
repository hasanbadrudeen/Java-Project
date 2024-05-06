package com.pack;
import java.util.*;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		if(num>0) {
			System.out.println("positive");
		}
		else {
			System.out.println("negative");
		}

	}

}

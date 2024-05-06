package com.pack;
import java.io.*;
import java.util.*;

public class Exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 19 ;
//		int b = 0 ;
//		int c = a/b;
//		System.out.println(c);
		
		
		
//		
//		File  file = new File("abc.txt");
//		try {
//			FileInputStream fs = new FileInputStream(file);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//			e.printStackTrace();
//		}
//		
//		System.out.println("hasan");
//		Scanner sc = new Scanner(System.in);
		
		double bal = 500 , withdraw = 700;
		try {
			if(bal<withdraw)
				throw new InsuffFundEx(withdraw-bal);
		}
		catch( InsuffFundEx e) {
			System.out.println("not enough money");
		}
		
		
		
		
		
		
		
//		
		
		

	}

}

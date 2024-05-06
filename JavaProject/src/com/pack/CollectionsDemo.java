package com.pack;
import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist = new ArrayList<Integer>();
	
		
		for(int i=1;i<=10;i++) {
			alist.add(i);
		}
		System.out.println(alist);
		alist.add(11);
		
		System.out.println(alist);
		System.out.println(alist.get(3));
		alist.set(0,0);
		System.out.println(alist);
		alist.remove(0);
		System.out.println(alist);
		
		for(int i : alist) {
			System.out.println(i);
		}
		
	}

}

package com.pack;
import java.util.*;


public class ListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"a","b","c","a","b","c"};
		System.out.println(arr);
		
		for(String i : arr ) {
			System.out.println(i);
		}
		
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(arr));	
		System.out.println(arrList);
		
		LinkedHashSet<String> list = new LinkedHashSet<String>(arrList);
		list.add("A");
		list.add("D");
		list.add("A");
		System.out.println(list);
		System.out.println(list.contains("D"));
		
		HashMap<String,Integer> Map = new HashMap<String,Integer>();
//		Map.put("Name", Hasan);
		Map.put("Age", 21);
		
		System.out.println(Map);
	}

}

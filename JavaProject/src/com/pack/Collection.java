package com.pack;
import java.util.*;


public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrli = new ArrayList<Integer>();
		arrli.add(1);
		arrli.add(2);
		arrli.add(3);
		
		System.out.println(arrli);
		
		LinkedList<Integer> linli = new LinkedList <Integer>();
		linli.add(3);
		linli.add(4);
		linli.add(5);
		System.out.println(linli);
		
		
		HashSet<Integer> Hset = new HashSet<Integer>();
		Hset.add(5);
		Hset.add(6);
		Hset.add(7);
		Hset.add(10);
		Hset.add(12);
		Hset.add(16);
		System.out.println(Hset);
		
		LinkedHashSet<Integer> lihset = new LinkedHashSet <Integer>();
		 lihset.add(7);
		 lihset.add(8);
		 lihset.add(9);
		 
		System.out.println( lihset);
		
		TreeSet<Integer> Tset = new TreeSet<Integer>();
		Tset.add(9);
		Tset.add(10);
		Tset.add(8);
		
		System.out.println(Tset);
		
		
		HashMap<String, Object> Hmap = new HashMap<String,Object>();
		
		Hmap.put("name", "Hasan");
		Hmap.put("Age", 21);
		Hmap.put("course", "java");
		System.out.println(Hmap);
		
		System.out.println(arrli.get(0));
		System.out.println(arrli.remove(1));
		System.out.println(arrli);
		
		
		Hset.remove(6);
		System.out.println(Hset);
		
//		for(int i : Hset) {
//			System.out.println(i);
//		}
		
		Iterator iter = Hset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println(Hset.size());
		System.out.println(Hset.contains(10));
		
		
//		System.out.println(Hmap.get("name"));
		System.out.println(Hmap.remove("Age"));
		System.out.println(Hmap);
		
		
	}

}

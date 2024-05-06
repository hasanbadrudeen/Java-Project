package com.pack;

public class VarArgsDemo {
	
static int minvalue(int...valss) {
		int min = Integer.MAX_VALUE;
		for(int k : valss) {
			if(k<min)
				min = k;
		}
		return min ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m =minvalue(2,8,9,4);
		System.out.println(m);
		System.out.print(minvalue());
	}

}

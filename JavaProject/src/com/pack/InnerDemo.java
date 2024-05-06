package com.pack;


class outer{
	int num ;
	void outerDisplay(){
		System.out.println("outer display");
	}
	static class inner{
		int x ;
		void innerdisplay() {
		System.out.println("inner display");
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer o = new outer();
		o.num = 10 ;
		o.outerDisplay();
		outer.inner i = new outer.inner();
		i.innerdisplay();

	}
}
}


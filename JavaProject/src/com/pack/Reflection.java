package com.pack;
import java.lang.reflect.*;

public class Reflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		Class cls = e.getClass();
		System.out.println("class name is " + cls.getName());
		
		Method[] methods=cls.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
		System.out.print(methods[0].invoke(e, null));
	}

}

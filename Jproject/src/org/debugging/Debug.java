package org.debugging;

import java.util.Scanner;

public class Debug {

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			System.out.printl(n);
		} finally {
		}
	}

}

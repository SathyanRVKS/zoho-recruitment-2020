package com.seven.programs;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		int length = input.length();
		
		StringBuilder space = new StringBuilder();
		for(int i = 0; i < length; ++i)
			space = space.append(" ");
		
		int mid = length / 2 + 1;
		char[] result = new char[length];
		for(int i = 0; i < length; ++i) {
			
			result[(mid + i) % length] = input.charAt(i);
		}
		String res = String.valueOf(result);
		
		for(int i = 1; i <= length; ++i) {
			
			int spaces = length - i;
			System.out.println(space.substring(0, spaces) + res.substring(0, i));
		}
		sc.close();
	}
}

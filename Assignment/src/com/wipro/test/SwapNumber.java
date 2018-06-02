package com.wipro.test;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		System.out.println("Please enter the first and second number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		n=n*n1;
		n1=n/n1;
		n=n/n1;
		System.out.println(n+"hi"+n1);
	}
	

}

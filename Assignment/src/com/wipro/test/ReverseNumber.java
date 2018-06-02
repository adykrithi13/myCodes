package com.wipro.test;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int a,n=0,m;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		m=x;
		while(x>0)
		{
			a= x%10;
			n= n*10+a;
			x = x/10;
		}
		if(m==n)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("no");
		}

	}

}

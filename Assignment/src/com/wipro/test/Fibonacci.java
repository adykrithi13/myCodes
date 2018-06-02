package com.wipro.test;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b =1;
		int sum = 0;
		for(int i=2;i<10;i++)
		{
			sum = a+b;
			System.out.println(sum);
			b=a;
			a= sum;			
		}
}
}


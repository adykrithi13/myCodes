package com.wipro.test;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) 
	{
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n/2;
		for(int i = 2; i<=a;i++)
		{
				if(n%i==0)
				{
					System.out.println("n is not a prime");
					break;
				}
				else
				{
					if(i==a)
					{
					System.out.println("n is prime");
					break;
					}
				}
			}
	}
}
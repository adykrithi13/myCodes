package com.wipro.test;

import java.util.Scanner;

public class CountPalindrome {

	public static void main(String[] args) {
	int n =0,rev=0;
	Scanner sc = new Scanner (System.in);
	System.out.println("Plese enter the total number counts");
	int x = sc.nextInt();
	int[] array = new int[x];
	int[] array1 = new int[x];
	for(int i=0;i<x;i++)
	{
		System.out.println("Enter numbers");
		array[i] = sc.nextInt();
		array1[i] = array[i] ;
		while(array[i]>0)
		{
		int f = array[i]%10;
		rev = rev*10+f;
		array[i] = array[i]/10;
		
		}
		if(array1[i]==rev)
		{
			//System.out.println(array1[i]);
			System.out.println("palindrome");
		}
		else
		{
			//System.out.println(array1[i]);
			System.out.println("no");
		}
	}
	}
}

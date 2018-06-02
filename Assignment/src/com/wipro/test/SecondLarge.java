package com.wipro.test;

import java.util.Scanner;

public class SecondLarge {

	public static void main(String[] args) {
		System.out.println("Enter the total values");
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[] numbers = new int[total];
		System.out.println("Please enter all the"+total+"values");
		int swap =0;
		for(int i=0;i<total;i++)
		{
			Scanner sc1 = new Scanner(System.in);
			numbers[i]= sc1.nextInt();
		}
		int largest = numbers[0];
		System.out.println("Entered values are");
		for(int i=0;i<total;i++)
		{
			System.out.println(numbers[i]);
		}
		for(int j = 0; j < total; j++)
		{
			if(numbers[j]> largest) 
			{
			 largest = numbers[j];	
			}
		}

		for(int k = 1; k < total; k++)
		{
			if(numbers[k]> numbers[k-1]) 
			{
				if((numbers[k]!=largest)&&(swap < numbers[k])) 
					swap = numbers[k];
			}
			if(numbers[k]< numbers[k-1]) 
			{
				if((numbers[k-1]!=largest)&&(swap < numbers[k-1]))
					swap = numbers[k-1];	
			}
		}
		System.out.println("largest value"+largest);
		System.out.println("second largest value"+swap);
	}
}
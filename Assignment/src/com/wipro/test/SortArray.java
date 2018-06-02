package com.wipro.test;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
	
		System.out.println("Enter the total values");
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[] numbers = new int[total];
		System.out.println("Please enter all the"+total+"values");
		for(int i=0;i<total;i++)
		{
			Scanner sc1 = new Scanner(System.in);
			numbers[i]= sc1.nextInt();
		}
		int temp = numbers[0];
		System.out.println("Entered values are");
		for(int i=0;i<total;i++)
		{
			System.out.println(numbers[i]);
		}
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(numbers[i]>numbers[j])
				{
					temp = numbers[i];
					numbers[i]= numbers[j];
					numbers[j]=temp;
					}
				}
			
		}
		//1 8 4 5 3
		
		//1 4 8 5 3
		//    4 5 3
			System.out.println("Sorted order");
			for(int i=0; i< total;i++)
			{
			System.out.println(numbers[i]);
			}
		}
	}


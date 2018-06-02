package com.wipro.test;

public class StarProgram {
	
	public static void main(String[] args) {
		int k = 5;
		System.out.println("* in ASCENDING ORDER");
		for (int i = 0; i <=5 ;i++)
		{
			for(int j =0; j< i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n" +"* in DESSCENDING ORDER");
		for (int i = 5; i >=0 ;i--)
		{
			for(int j =0; j< i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("* in TREE ORDER");
		for (int i = 0; i <5 ;i++)
		{
			
			for(int j =0; j<k; j++) 
			{
				System.out.print(" ");
			}
			k=k-1; 
			for(int l=0;l<=i;l++) {
				
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
}
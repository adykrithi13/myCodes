package com.wipro.test;

public class NumberStarProgram {

	public static void main(String[] args) {
		int k =5;
		int x =1;
		int a = 0;
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=k;j++)
		{
			System.out.print(" ");
		}
		k=k-1;
		for(int l=1;l<=i;l++) 
		{
			System.out.print(x+" ");
			x=x+1;
			
		}
		
		x=1;
		System.out.println();
		}
	}
	}




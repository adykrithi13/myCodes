package com.wipro.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string to check");
		String a =sc.next();
		String rev ="";
		char[] temp = a.toCharArray();
		char[] temp1 = a.toCharArray();
		char b;
		int j=temp.length-1;
		
			for(int i=temp.length-1;i>=0;i--)
			{
				rev=rev+(a.charAt(i));
			}
			System.out.println(rev);
			
			if(a.equals(rev)) {
				System.out.println("its a palindrome");
			}
			else
			{
				System.out.println("its not a palindrome");
			}
			/*for(int i=0 ,k = (temp.length)-1; i< (temp.length)-2 && k>0 ;i++,k--)
			{
				b = temp[i];
				temp[i]= temp[j];
				temp[j] = b;
			}
			System.out.println(temp);*/
		}
		
	}


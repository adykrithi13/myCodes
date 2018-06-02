package com.wipro.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NoOfChars {

	public static void main(String[] args) {
		String input = "This is Java program";
		System.out.println("Please enter the input u wanna search");
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);	
		char c = sc.next().charAt(0);
		char temp;
		int a =0;
		for(int i=0;i<input.length();i++)
		{
			temp = input.charAt(i);
			if(c==temp)
			{
				a=a+1;
			}
		}
		System.out.println(a+"number of tyms this character is displayed");
	}
	
}

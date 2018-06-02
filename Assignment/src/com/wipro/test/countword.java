package com.wipro.test;

import java.util.Scanner;

public class countword {

	public static void main(String[] args) {
		String a1 = "hello long time no time new";
		String[] splitting = a1.split(" ");
		int a = splitting.length;
		for (int i = 0; i < a; i++) {
			int increment = 1;
			for (int j = i+1; j < splitting.length; j++) {
				if (splitting[i].equals(splitting[j])) {
					increment = increment+1;
					splitting[j] = "";
					//a--;
					
				}
			}
			System.out.println(splitting[i]+"occured"+"\t"+increment+"times");
		}
	}

}

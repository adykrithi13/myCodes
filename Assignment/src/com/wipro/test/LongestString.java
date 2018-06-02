package com.wipro.test;

public class LongestString {

	public static void main(String[] args) {
		String a = "This abcdefghijklm the programmings abcdefghijklmnn Java";
		String[] x = new String[5];
		int z =0;
		x=a.split(" ");
		char[] text = null;
		char[] text1 = null;
		char[] temp = { } ;
		String f = null;
		for(int i=1;i<x.length;i++)
		{
			text=x[i].toCharArray();
			text1=x[i-1].toCharArray();
			if(text.length>text1.length)
			{
				if(text.length>temp.length)
				{
				temp= text;
				z=temp.length;
				f= String.valueOf(temp);
				}
			}	
			else
			{
				if(text.length>temp.length)
				{
				temp = text1;
				z=temp.length;
				f= String.valueOf(temp);
				}
			}
		}
		System.out.println("length is"+z);
		System.out.println("Longest String is "+f);
			//System.out.println(text1);
		}
	}

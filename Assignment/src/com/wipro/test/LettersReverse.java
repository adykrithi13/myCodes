package com.wipro.test;

public class LettersReverse {

	public static void main(String[] args) {
		String text = "This is Java Program";
		String[] arr = text.split(" ");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		String first = arr[0];
		String second = arr[2];
		char[] temp = first.toCharArray();
		char[] temp1 = second.toCharArray();
		char tvar;
		int i,j;
		for(i=0 ,j = (temp.length)-1; i< (temp.length)-2 && j>0 ;i++,j--)
		{
			tvar = temp[i];
			temp[i]= temp[j];
			temp[j] = tvar;
		}
		for(i=0 ,j = (temp1.length)-1; i< (temp1.length)-2 && j>0 ;i++,j--)
		{
			tvar = temp1[i];
			temp1[i]= temp1[j];
			temp1[j] = tvar;
		}
		System.out.println(temp);
		System.out.println(temp1);
	}
}

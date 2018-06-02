package com.wipro.test;

public class CountCharacter {

	public static void main(String[] args) {
		String a = "hello long time no time hello";
		char[] text = a.toCharArray();
		for (int i=0; i<text.length;i++)
		{
			int inc = 1;
			char replace = text[i];
			for (int j=i+1; j<text.length;j++)
			{
				if(text[i] == text[j])
				{
					inc = inc +1;
				}
			}
			
			text = a.toCharArray();
			System.out.println(text[i]+"occured"+"\t"+inc+"times");
		}

	}

}

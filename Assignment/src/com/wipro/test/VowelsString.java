package com.wipro.test;

public class VowelsString {

	public static void main(String[] args) {
		String a = "This vt tx enn";
		char[] vowles = {'a','e','i','o','u'};
		String sentence = "";
		int n =0;
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<vowles.length;j++)
			{
				if(a.charAt(i)==vowles[j])
				{
					if(n==0)
					{
						sentence = sentence+a.charAt(j);
						n=n+1;
						break;
					}
					else
					{
						n=-1;
						break;
					}
				}		
			}
			if(sentence.length()>=1&& n!=-1)
			{
				if(i==a.length()-1)
				{
					break;
				}
				else
				{
					sentence=sentence+a.charAt(i+1);
					continue;
				}
			}
		
			}
		System.out.println(sentence);
		}
	

	}


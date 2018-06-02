package com.wipro.test;

import java.util.ArrayList;
import java.util.List;

public class MonoArray {

	public static void main(String[] args) {
		int[] a = { 8, 9, 10, 1, 2, 3, 4 };
		List<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		int i = 1;

		while (i < (a.length)) {
			if (a[i] > a[i - 1]) {
				al.add(a[i - 1]);
				i++;
			}
			if (a[i] < a[i - 1]) {
				al.add(a[i]);
				al1.add(a[i - 1]);
				int l = i - 1;
				
				for (int j = l + 1; j < a.length-1; j++) {
					if (a[j] > a[j - 1]) {
						al1.add(a[j - 1]);
						System.out.println(al);
						System.out.println(al1);
					}
				}

			}
		}
	}
}

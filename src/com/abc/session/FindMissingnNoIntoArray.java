package com.abc.session;

import java.util.Arrays;

public class FindMissingnNoIntoArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 3, 7, 8, 9, 4, 2, 6 };

		int sum=0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Sum of Array is: "+sum);

	}

}

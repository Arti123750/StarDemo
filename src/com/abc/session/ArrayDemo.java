package com.abc.session;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ArrayDemo {

	public static void m1() {

		Scanner sc = new Scanner(System.in);
		Integer[] myArr = new Integer[] { 7, 8, 9, 4, 6, 3, 9, 3 };

		Integer[] myArr1 = myArr;
		System.out.println("Copy one aaray into onther array using assingment:");
		for (int k = 0; k < myArr1.length; k++) {
			System.out.print(" " + myArr[k]);
		}
		System.out.println();
		System.out.println("Array sort using Arrays.sort method:");
		for (int i = 0; i < myArr.length; i++) {
			Arrays.sort(myArr);
			System.out.print(" " + myArr[i]);

		}

		List<Integer> list = Arrays.asList(myArr);
		System.out.println();
		System.out.println("Array to list: " + list);

		Set set = new HashSet<>(list);
		System.out.println("ArrayList to set: " + set);

	}

	public static void main(String[] args) {
		m1();
	}
}

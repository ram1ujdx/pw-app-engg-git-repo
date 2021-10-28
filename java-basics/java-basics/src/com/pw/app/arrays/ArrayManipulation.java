package com.pw.app.arrays;

import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size : ");
		
		int size=scanner.nextInt();
		
		int []nums = new int[size];
		
		
		for(int i=0; i<size; i++) {
			System.out.print("Input an element : ");
			nums[i]=scanner.nextInt();
		}
		
		
//		for(int i=0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
		System.out.println("\nEntered elements are : ");
		for(int num:nums) {
			System.out.print(num+"\t");
		}
		
//		int [][]matrix = new int[][] {{2,3,4},{1,2,5},{4,5,8}};
		
		
		

	}

}

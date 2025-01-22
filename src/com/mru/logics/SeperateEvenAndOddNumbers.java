package com.mru.logics;

public class SeperateEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int even =0;
		int odd =0;
		for(int element:arr) {
			even += element%2==0?1:0;
			odd += element%2!=0?1:0;
		}
		int[] arr1 = new int[even];
		int[] arr2 = new int[odd];
		

	}

}

package com.mru.logics;

public class EquilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {-7,1,5,2,-4,3,0};
		int totalSum=0, leftSum=0;
		boolean flag = false;
		for(int element:array) {
			totalSum+=element;
		}
		for(int i=0;i<array.length;i++) {
			totalSum-=array[i];
			if(totalSum == leftSum) {
				System.out.println("Equilibrium Point: "+i);
				flag = true;
				break;
			}else {
				leftSum+=array[i];
			}
		}

	}

}

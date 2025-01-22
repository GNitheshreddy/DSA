package com.mru.logics;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev =0;
		int num = 121;
		int original = num;
		//int x =num;// used in checking the palindrome
		
		while(num!=0) {
			int rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		System.out.println(rev);
		
		//checking palindrome
		if(original == rev) {
			System.out.print("Palindrome");
		}else {
			System.out.println("Not palindorme");
		}
	}

}

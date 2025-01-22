package com.mru.logics;

public class ReverseStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Data Structures";
		//convert String to char array
		char[] arr = str.toCharArray();
		
		int  start =0, end = arr.length-1;
		//declare infinite loop
		while(start<end) {
			char temp = arr[start];
			arr[start]=arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
		//convert character array to string 
		String rev = new String(arr);
		System.out.println(rev);
		
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindorme");
		}

	}

}

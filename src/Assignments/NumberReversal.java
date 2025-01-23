package Assignments;

import java.util.Arrays;

public class NumberReversal {

    public static void main(String[] args) {
        int[] arr = {101, 201, 301, 401, 501};
        int[] reversed = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = reverseNumber(arr[i]);
        }
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Reversed Array: " + Arrays.toString(reversed));
//        for(int i=0;i<arr.length;i++) {
//        	System.out.println("Original Array: "+arr[i]);
//        }
//        for(int i=0;i<arr.length;i++) {
//        	System.out.println("Revesed  Array: "+ reversed[i]);
        }
    
    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        return reversed;
    }
}

package Assignments;

import java.util.Arrays;
public class AdjacentSum{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int sum=0;
        int[] AdjacentArr = new int[arr.length / 2];
        for(int i=0;i<arr.length/2;i++){
            sum = arr[i]+arr[arr.length-i-1];
            AdjacentArr[i] = sum;
        }
        // for(int element:AdjacentArr){
        // System.out.println(element);
        System.out.println("Adjacent arr:"+Arrays.toString(AdjacentArr));
    }
    }
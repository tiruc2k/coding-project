package org.tc.dynamic.prog;

import java.util.Arrays;

public class LongestSequence {
	
	/* lis() returns the length of the longest increasing  subsequence in arr[] of size n */
	 static int longestSubSeqLength(int arr[],int n)
	 {
	       int lis[] = new int[n];
	       int max = 0;
	
	       /* Initialize LIS values for all indexes */
	        for (int i = 0; i < n; i++ )
	           lis[i] = 1;
	
	        /* Compute optimized LIS values in bottom up manner */
	        for (int i = 1; i < n; i++ ){
	        	System.out.println("when i is :"+i);
	           for (int j = 0; j < i; j++ ) {
	              if ( arr[i] > arr[j] && lis[i] < lis[j] + 1){
                	  lis[i] = lis[j] + 1;
                  }
	              System.out.println("\tj is "+ j +" :"+Arrays.toString(lis));
	            }
	           //System.out.println("when i is "+i+" :"+Arrays.toString(lis));
			}
	
	        /* Pick maximum of all LIS values */
	        for (int i = 0; i < n; i++ )
	           if ( max < lis[i] )
	              max = lis[i];
	
	         return max;
	 }
	public static void main(String[] args){
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		//int arr[] = { 10, 9, 8, 7,6, 5, 4, 3 };
        int n = arr.length;
        System.out.println("Length of lis is : " + longestSubSeqLength(arr, n));
	}
}
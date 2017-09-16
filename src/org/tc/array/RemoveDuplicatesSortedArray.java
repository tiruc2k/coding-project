package org.tc.array;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
	
	public static int[] removeDuplicate(int[] A){
		int length=A.length; 
	    if(length==0 || length==1) {
	    	return A;
	    }
	    int i=1; 
	    for(int j=1; j<length; j++) 
	    {
		      if(A[j]!=A[j-1])
		      {
		        A[i]=A[j]; 
		        i++; 
		      }
	    }
	   return Arrays.copyOf(A,i);
	 }
	
	public static void main(String[] args){
		int[] a = {1,1,2};
		System.out.println(Arrays.toString(a));
		a = removeDuplicate(a);
		System.out.println(Arrays.toString(a));
	}
	

}

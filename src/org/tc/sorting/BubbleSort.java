package org.tc.sorting;

import java.util.Arrays;

public class BubbleSort {
	
	static void bubbleSort(int[] arr){
		for(int i =0 ; i < arr.length-1; i++){
			boolean isSwap = false;
			System.out.println("\n"+Arrays.toString(arr) + " Iteration :"+i);
			for(int j=0; j < arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					isSwap = true;
				}
			}
			if(isSwap == false){
				break;
			}
		}
	}
	static void print(int[] arr){
		System.out.println();
		for(int i=0; i<arr.length;i++){
			if(i == arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i]+",");
		}
	}
	
	static void insertionSort(int arr[], int n)
	{
	   int i, key, j;
	   for (i = 1; i < n; i++)
	   {
	       key = arr[i];
	       j = i-1;
	 
	       /* Move elements of arr[0..i-1], that are
	          greater than key, to one position ahead
	          of their current position */
	       while (j >= 0 && arr[j] > key)
	       {
	           arr[j+1] = arr[j];
	           j = j-1;
	       }
	       arr[j+1] = key;
	   }
	}
	
	static void selectionSort(int[] arr){
		for(int i = 0 ; i < arr.length -1; i++){
			int index = i;
			for(int j = i+1; i < arr.length; i++){
				 if (arr[j] < arr[index]) {
	                    index = j;
				 }
			}
			 int smallerNumber = arr[index];  
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
		}
	}
	

	    
	    static int[] twoSum(int[] nums, int target) {
	         int[] a = new int[2];
	         for(int i = 0 ; i < nums.length; i++){
	             for (int j = i+1 ; j < nums.length ; j++){
	            	 System.out.printf(" i=%d and j=%d\n",+ i, j);
	                 if(target - nums[j] == nums[i]){
	                     a[0] = i;
	                     a[1] = j;
	                     break;
	                 }
	             }
	         }
	        return a;
	    }

	public static void main(String ...strings ){
		
		 int[] x = {3,2,4};
		 System.out.println(Arrays.toString(twoSum(x,6)));
		
	}
}

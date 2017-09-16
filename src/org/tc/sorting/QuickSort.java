package org.tc.sorting;

import java.util.Arrays;

public class QuickSort {
	
	public void quickSort(int[] arr, int startIdx, int endIdx){
		if(startIdx < endIdx){
			int pivotIdx = partition(arr,startIdx,endIdx);
			quickSort(arr,startIdx,pivotIdx-1);
			quickSort(arr,pivotIdx+1,endIdx);
		}
	}
	
	public int partition(int[] arr, int startIdx, int endIdx){
		 int pivot = arr[endIdx];
		 int pIdx = startIdx;
		 for(int i=startIdx; i<endIdx; i++){
			 if(arr[i] <= pivot){
				 swap(arr[i],arr[pIdx]);
				 pIdx++;
			 }
		 }
		 swap(arr[pIdx],arr[endIdx]);
		 return pIdx;
	}
	
	public void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String ...strings ){
		int[] arr = {7, 10, 4, 3, 20, 15};
		System.out.println("Array before sort :"+ Arrays.toString(arr));
		new QuickSort().quickSort(arr, 0, arr.length -1);
		System.out.println("Array after sort :"+Arrays.toString(arr));
		
	}

}

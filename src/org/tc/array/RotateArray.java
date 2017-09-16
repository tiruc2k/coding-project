package org.tc.array;

public class RotateArray {
	
	public static void leftRotateArray(int[] arr, int x){
		if(arr == null || arr.length == 0){
			System.out.println();
			return;
		}
		int count = 0;
		while (count<x){
			int temp = arr[0];
			for(int  i=0;i< arr.length-1; i++){
				arr[i] = arr[i+1];
			}
			arr[arr.length-1] = temp;
			count++;
		}
	}
	
	public static void rightRotateArray(int[] arr, int x){
		if(arr == null || arr.length == 0){
			System.out.println();
			return;
		}
		int count = 0;
		while (count<x){
			int temp = arr[arr.length-1];
			for(int  i=arr.length-2;i>1; i--){
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
			count++;
		}
	}
	
	public static void printArray(int[] arr){
		System.out.println();
		for(int elem : arr){
			System.out.print(elem+",");
		}
	}
	
	public static void main(String ...strings){
		int[] arr = {1,2,3,4,5,6,7};
		printArray(arr);
		rightRotateArray(arr,2);
		printArray(arr);
	}

}

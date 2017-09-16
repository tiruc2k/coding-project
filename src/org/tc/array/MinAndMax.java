package org.tc.array;

public class MinAndMax {
	
	public static class Pair{
		int min;
		int max;
		Pair(int min,int max){
			this.min = min;
			this.max = max;
		}
	}
	
	public static Pair getMinAndMax(int[] arr, int arr_length) throws Exception{
		if(arr_length < 2){
			throw new Exception ("Array size should be more than 2");
		}
		//Initialize the min and max values.
		int min = arr[0];
		int max = arr[1];
		//Exchange min & max values if min is grater than max
		if(min > max){
			min = arr[1];
			max = arr[0];
		}
		//Go from  index=2 to end index
		for(int i=2; i< arr_length; i++){
			if(min > arr[i]){
				min = arr[i];
			}if(max < arr[i]){
				max = arr[i];
			}
		}
		return new Pair(min,max);
	}
	
	public static void main(String ...strings) throws Exception{
		int[] arr = {1, 60, -10, 70, -80, 85};
		int[] arr2 = {0};
		Pair pair = getMinAndMax(arr,arr.length);
		System.out.println("Min value:"+ pair.min +", Max value:"+ pair.max);
	}

}

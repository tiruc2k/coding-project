package org.tc.search;

public class RecurrsiveLinearSearch {
	
	
	static int recSearch(int[] arr, int startIdx,int endIdx, int x){
		
		if(endIdx < startIdx){
			return -1;
		}if(arr[startIdx] == x){
			return startIdx;
		}
		return recSearch(arr,startIdx+1,endIdx,x);
	}
	
	
	static int getMissingNum(int[] a, int n){
		int x1 = 1;
		int x2 = 1;
		for(int i=1; i<n; i++){
			x1 = x1^a[i];
		}
		for(int i=2; i<=n+1; i++){
			x2 = x2^i;
		}
		return x1^x2;
	}
	public static void main(String ...strings ){
		int x = 3; 
		int arr[] = {12, 34, 54, 2, 3};
        //Method call to find x
        int index = recSearch(arr, 0, arr.length-1, x);
        if (index != -1)
           System.out.println("Element " + x + " is present at index " + 
                                                    index);
        else
            System.out.println("Element " + x + " is not present");
        
        int[] arr1 = {1,2,3,4,5,6,8};
        System.out.println(getMissingNum(arr1,arr1.length));
     }
}




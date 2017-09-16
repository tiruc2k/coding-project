package org.tc.search;

public class BinarySerarch {
	
	public static void sort(int[] arr){
		for(int i=0; i<arr.length; i++){
			for (int j = i+1; j< arr.length; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void print(int[] arr){
		for(int i = 0; i<arr.length ; i++){
			if(i == arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i]+",");
		}
		System.out.println("\n");
	}
	
	public static int findPosition(int[] arr, int x){
		int i = 0;
		int j = arr.length-1;
		if(arr[i] == x){
			return i;
		}
		if(arr[j] == x){
			return j;
		}
		if (x < arr[i] || x > arr[j]){
			return -1;
		}
		while(i < j){
			int mid = (i+j)/2+1;
			if( arr[i] < x && x < arr[mid] ){
				j = mid-1;
			}if(arr[mid] < x && x < arr[j] ){
				i = mid+1;
			}if(arr[mid] == x){
				return mid;
			}
		} // end of while loop
		return -1;
	}
	
	static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = (l + r)/2;
            // If the element is present at the middle itself
            if (arr[mid] == x)
               return mid;
 
            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
 
            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid+1, r, x);
        }
 
        // We reach here when element is not present in array
        return -1;
    }
	
	public static void main(String ...args){
		int[] a = {10,40,50,10,20,30,20};
		print(a);
		sort(a);
		print(a);
		System.out.println(binarySearch(a,0,a.length-1,0));
		System.out.println(binarySearch(a,0,a.length-1,10));
		System.out.println(binarySearch(a,0,a.length-1,20));
		System.out.println(binarySearch(a,0,a.length-1,30));
		System.out.println(binarySearch(a,0,a.length-1,40));
		System.out.println(binarySearch(a,0,a.length-1,50));
		System.out.println(binarySearch(a,0,a.length-1,60));
	}

}

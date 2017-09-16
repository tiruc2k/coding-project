package tc.org.sets;

public class SubSet {
	
	
	static void smallestPair(int arr[], int arr_size){
		if(arr_size <2){
			System.out.println("Input array should contains at least 2 elements.");
			return;
		}
		int firstMin = 0 ;
		int secondMin = 0;
		
		if(arr[0]>arr[1]){
			firstMin = arr[1];
			secondMin = arr[0];
		}
		for(int i=2; i<arr_size; i++){
			if(arr[i] < firstMin){
				secondMin = firstMin;
				firstMin = arr[i];
			}
		}
		System.out.println("First Min: " +firstMin +" ,Second Min:" + secondMin );
		
	}
	static void minAbsSumPair1(int arr[], int arr_size){
		 int elem1 = arr[0];
		 int elem2 = arr[1];
		 int min = Math.abs(elem1-elem2);
		 for(int i=0; i<arr_size; i++){
			 for(int j=i+1; j<arr_size;j++){
				 if(min > Math.abs(Math.abs(arr[i])-Math.abs(arr[j]))){
					 min = Math.abs(Math.abs(arr[i])-Math.abs(arr[j]));
					 elem1 = arr[i];
					 elem2 = arr[j];
				 }
			 }
		 }
		 System.out.println(min + " elements "+ elem1 +" and "+elem2);
	}
	 static void minAbsSumPair(int arr[], int arr_size)
	    {
	      int l, r, min_sum, sum, min_l, min_r;
	      
	      /* Array should have at least two elements*/
	      if(arr_size < 2)
	      {
	        System.out.println("Invalid Input");
	        return;
	      }
	      
	      /* Initialization of values */
	      min_l = 0;
	      min_r = 1;
	      min_sum = arr[0] + arr[1];
	      
	      for(l = 0; l < arr_size - 1; l++)
	      {
	        for(r = l+1; r < arr_size; r++)
	        {
	          sum = arr[l] + arr[r];
	          if(Math.abs(min_sum) > Math.abs(sum))
	          {
	            min_sum = sum;
	            min_l = l;
	            min_r = r;
	          }
	        }
	      }
	      
	      System.out.println(" The two elements whose "+
	                              "sum is minimum are "+
	                        arr[min_l]+ " and "+arr[min_r]);
	    }
	public static boolean isSubSet(int[] arr1, int[] arr2){
		for(int i=0; i< arr2.length; i++){
			boolean isElementFount = false;
			for(int j=0; j<arr1.length;j++){
				if(arr2[i] == arr1[j]){
					isElementFount = true;
					break;
				}
			}
			if(!isElementFount){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String ...strings){
		int arr1[] = {11, 1, 13, 21, 3, 7};
	    int arr2[] = {11, 3, 7, 1,2};
	    System.out.println(isSubSet(arr1,arr2));
	    int arr[] = {1, 60, -10, 70, -80, 85};
        minAbsSumPair(arr, arr.length);
        minAbsSumPair1(arr, arr.length);
        smallestPair(arr, arr.length);
        int[] arr3 = {0};
        smallestPair(arr3,1);
     }

}

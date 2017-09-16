package org.tc.array;

import java.util.Arrays;

public class MeanofTwoSortedArrays {
	
	static double findMedianOfSortedArrays(int[] a,int[] b){
		double median = 0.0;
		int[] temp  = null;
        if(a == null || a.length == 0){
            temp = b;
        }if(b == null || b.length == 0){
            temp = a;
        }if(a.length != 0 && b.length != 0){
        	temp = new int[a.length + b.length];
        }
		int l = a.length + b.length;
		int i =0; int j=0; int k = 0;
		if(a.length > 0 && b.length > 0){
			while(k < l){
					if(a[i]	== b[j]){
						temp[k++] = a[i++];
						temp[k++] = b[j++];
					}else if (a[i]< b[j]){
						temp[k++] = a[i++];
					}else{
						temp[k++] = b[j++];
					}
					if(i == a.length && j < b.length){
						for( int x = j; x < b.length; x++){
							temp[k++] = b[x];
						}
					}
					if(j == b.length && i < a.length){
						for( int x = i; x < a.length; x++){
							temp[k++] = a[x];
						}
					}
				}
		}
		System.out.printf("l is %d\n",l);
		System.out.println(Arrays.toString(temp));
		if(l == 1){
			median = temp[0];
		}else if(l == 2 ){
			median = (double)(temp[0]+ temp[1])/2;
		}
		else if(l%2 == 0){
			median = (double)(temp[l/2]+ temp[l/2-1])/2;
		}else{
			median = temp[l/2];
		}
		System.out.println(median);
		return median;
	}
	public static void main(String[] args){
		int[] a = {1,2};
		int[] b = {3,4};
		findMedianOfSortedArrays(a,b);
	}

}

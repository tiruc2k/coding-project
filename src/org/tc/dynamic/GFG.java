package org.tc.dynamic;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int pivot(int[] A, int start,  int end){
//		int pivot = 0;
		if(end< start){
			return -1;
			
		}
		if(start == end){
			return start;
		}
		int mid = (end + start) / 2;
		//System.out.println("mid is :"+mid);
		if(A[mid] > A[mid+1] && A[mid] > A[mid - 1]){
			return mid;
		}
		
		if(A[mid] <= A[mid - 1]){
			return pivot(A, start, mid - 1);
			
		}
		return pivot(A, mid + 1, end);
//		return pivot;
	}
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int t1=0; t1<t; t1++){
		    int size = s.nextInt();
		    int arr[] = new int[size];
		    for(int i=0; i<size;i++){
		        arr[i] = s.nextInt();
		    }
		    int res = pivot(arr,0,size-1);
		    if(res!=-1){
		        System.out.println(arr[res]);
		    }
		    
		}
	}
}

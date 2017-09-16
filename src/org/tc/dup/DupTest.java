package org.tc.dup;

import java.util.ArrayList;
import java.util.List;

public class DupTest {
	
	/**
	 * method to find the non repeated element in given array
	 * @param arr
	 * @return
	 */
	public static int findDup(int[] arr){
		List<Integer> list = new ArrayList<>();
		for(int i : arr){
			if(list.contains(i)){
				list.remove((Integer)i);
			}else{
				list.add(i);
			}
		}
		if(!list.isEmpty()){
			return list.get(0);
		}
		return -1;
	}
	
	public static void main(String ...strings ){
		@SuppressWarnings("unused")
		Object[] objArray = new Object[10];
		Integer[] intArray = new Integer[10];
		objArray = intArray;
		int[] arr = {1,5,6,8,9,9,8,6,5};
		System.out.println(findDup(arr));
	}

}

package org.tc.dynamic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    
   private int count(int[] a, int n){
       int count = 0;
       for(int i=0 ; i < a.length ; i++){
           if (a[i] == n){
               count++;
           }
       }
       return count;
   }
    
    private int occurances(List<Integer> list,int a){
        int count = 0;
        for (int elem : list){
            if(elem == a){
                count ++;
            }
        }
        return count;
    }
    
   public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list =  new ArrayList<>();
        for(int i = 0 ;i<nums1.length; i++)
        {
            for(int j =0 ; j < nums2.length; j++)
            {
            	
                if(nums1[i] == nums2[j] &&  Math.min(count(nums1,nums1[i]),count(nums2,nums1[i]))> occurances(list,nums1[i]) ){
                     list.add(nums1[i]);
                     break;
                }
            }       
        }
        //return Arrays.toArray(list);
        int[] retArray = new int[list.size()];
        int i = 0; 
        for(Integer x : list){
            retArray[i++] = x;
        }
        return retArray;
    }
   
   public static void main(String ...strings ){
	   Solution s = new Solution();
	   int[] nums1 = {1,2,2,1};
	   int[] nums2 = {2};
	   System.out.println(Arrays.toString(s.intersect(nums1, nums2)));
   }
}
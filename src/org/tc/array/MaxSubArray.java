package org.tc.array;

import java.util.Arrays;

public class MaxSubArray
{
    public static void main (String[] args)
    {
        int [] a = {-2,-1};
        System.out.println("Maximum contiguous sum is " +
        		maxSubArray(a));
    }
    
    static int maxSubArray(int [] a){
        int[] solution = new int[a.length+1];
        solution[0] = 0;

        for (int j = 1; j <solution.length ; j++) {
            solution[j] = Math.max(solution[j-1]+a[j-1],a[j-1]);
        }
        //this will print the solution matrix
        System.out.println(Arrays.toString(solution));
        //now return the maximum in the solution array
        int result = solution[1];
        for (int j = 1; j <solution.length ; j++) {
            if(result<solution[j])
                result = solution[j];
        }

        return result;
    }
       
    }

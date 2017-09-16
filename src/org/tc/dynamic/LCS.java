package org.tc.dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class LCS {
		
	public int lcs(char[] x,char[] y){
		int count=0;
		List<Character> list = new ArrayList<>();
		for(Character c1: x ){
			for(Character c2: y){
				if(c1 == c2 &&  !list.contains(c1)){
					count++;
					list.add(c1);
				}
			}
		}
		return count;
	}
	/**
	 * least common subsequence
	 * @param x
	 * @param y
	 * @param m
	 * @param n
	 * @return
	 */
	public int lcs(char[] x,char[] y, int m,int n){
		//System.out.println(Arrays.toString(x)+","+ Arrays.toString(y)+","+m+","+n);
		if(m==0 || n==0){
			return 0;
		}
		if(x[m-1] == y[n-1]){
			return 1+lcs(x,y,m-1,n-1);
		}else{
			return max(lcs(x,y,m,n-1),lcs(x,y,m-1,n));
		}
	}
	
	/**
	 * it returns the maximum of given two number
	 * @param a
	 * @param b
	 * @return
	 */
	public int max(int a, int b){
		return a>b ? a : b;
	}
	
	public List<Integer> fib(int n){
		Map<int[],String> hm = new HashMap<>();
		int[] a ={1,2,3};
		int[] b = a;
		hm.put(a, "value");
		System.out.println(hm.get(a));
		System.out.println(hm.get(b));
		
		List<Integer> fibList = new ArrayList<>();
		int f0 = 0;
		int f1 = 1;
		int f2 = f0 + f1;
		fibList.add(f0);
		fibList.add(f1);
		while (f2 < n){
			f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
			fibList.add(f2);
		}
		return fibList;
	}
	
	public static void main(String...strings){
		LCS lcs = new LCS();
		String s1 = "AGGTAB";
		String s2 = "BGXTXAY";
		System.out.println(lcs.lcs(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length()));
		System.out.println(lcs.lcs(s1.toCharArray(), s2.toCharArray()));
		System.out.println(lcs.fib(8));
	}

}

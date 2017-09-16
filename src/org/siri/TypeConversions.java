package org.siri;

import java.util.Arrays;

public class TypeConversions {
	
	
	// Create an array with all unique elements
	public static int[] removeDuplicates(int[] a) {
		if (a == null || a.length < 2)
			return a ;
	 
		int i = 0;
		int j = 1;
	 
		while (j < a.length) {
			
			if (a[i] == a[j]) {
				j++;
			} else {
				i++;
				a[i] = a[j];
				j++;
			}
		}
		
		return  Arrays.copyOf(a, i + 1);
		//System.out.println(Arrays.toString(a));
	}
	 
	public static void main(String[] args) {
		int[] arr = {0,1,1,1, 2, 2,2, 3,3,3,3,3,3,3,3};
		arr = removeDuplicates(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static int a;
	int b;
	
	{
		System.out.println("non-static block"+a);
	}
	static
	{
		System.out.println("static block"+a);	
	}
	TypeConversions(){
		System.out.println("constuctor");
	}
	public static void printValue(double d){
		System.out.println(d);
	}
	public static void main1(String[] args){
		TypeConversions tc = new TypeConversions();
		
		byte   b = 0;
		short  s = b;
		char   c = Character.MIN_VALUE;
		int   i = s;
		long   l = 'c' ;
		float f = l;
		double d = l;
		c = (char) d;
		b = (byte) c;
		printValue(b);
		printValue(s);
		printValue(c);
		printValue(i);
		printValue(l);
		printValue(f);
		printValue(d);
		System.out.println("value of c is "+c);
		System.out.println("value of c is"+Character.MIN_VALUE);
		System.out.println(-4.0/-0.0);
		System.err.println(0.0/0.0);
		
	}

}

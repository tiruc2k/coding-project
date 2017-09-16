package org.tc.number;

import java.util.Arrays;

public class TwoStringPermutation {
	
	public static boolean isPermutation2(String s1, String s2) {
		if (null == null){
			System.out.println("null == null");
		}
	    int length1 = s1.length();
	    int length2 = s2.length();
	    if (length1 != length2)
	        return false;

	    int a1[] = new int[256];
	    int a2[] = new int[256];

	    for (int i = 0; i < length1; ++i) {
	    	++a1[s1.charAt(i)];
	        ++a2[s2.charAt(i)];
	        System.out.println(s1.charAt(i)+","+a1[s1.charAt(i)]+":"+s2.charAt(i)+","+a2[s2.charAt(i)]);
	    }

	    for (int i = 0; i < a1.length; ++i) {
        if (a1[i] != a2[i])
	            return false;
	    }       
	    return true;
	  }
	
	public static boolean isPermutation1(String str1, String str2)
	{
	    char[] x = str1.toCharArray();
	    char[] y = str2.toCharArray();
	    Arrays.sort(x);
	    Arrays.sort(y);
	    if(Arrays.equals(x, y))
	        return true;
	    return false;
	}

	public static boolean isPermutation(String s1, String s2){
	    if (s1.length() != s2.length()) return false;
	    int checker = 0;
	    for(int i = 0; i < s1.length();i++ ){
	        checker ^= s1.charAt(i) ^ s2.charAt(i);
	    }

	    return checker == 0;         
	}

	public static void main(String[] args){
		System.out.println(isPermutation("aabcd", "bcddd"));
		System.out.println(isPermutation1("aabcd", "bcddd"));
		System.out.println(isPermutation2("aab*cd", "*bcdaa"));
		String s1 = new String("abc");
		String s2 = new String("abc");
		TwoStringPermutation obj1 = new TwoStringPermutation();
		TwoStringPermutation obj2 = new TwoStringPermutation();
		System.out.println(obj1.hashCode() +  "::::" + obj1.toString() + "::::"+obj1.equals(obj2));
		System.out.println(obj2.hashCode() + ":" + obj2.toString());
		System.out.println(s1.hashCode()+":"+s1.toString() + ":"+ s1.equals(s2));
		System.out.println(s2.hashCode()+":"+s2.toString());
		
	}

}

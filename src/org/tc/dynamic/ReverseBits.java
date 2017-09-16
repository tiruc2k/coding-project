package org.tc.dynamic;

public class ReverseBits {
	
	static int reverseValue(int a){
		int retVal = 0;
		StringBuffer sb = new StringBuffer();
		int rem;
		while(a > 0){
			rem = a%2;
			sb.append(rem);
			a = a/2;
		}
		int multi = 1;
		sb.reverse();
		for(int i =0; i < sb.length();i++){
			if (sb.charAt(i) == 49){
				retVal +=multi;
			}
			multi *= 2;
		}
		return retVal;
	}
	public static void main(String[] args){
		//System.out.println(reverseValue(8));
		int a = Integer.MIN_VALUE;
		System.out.println(a);
		System.out.println(a<<2);
		//System.out.println(a<<<2);
		System.out.println(a>>2);
		System.out.println(a>>>2);
	}

}

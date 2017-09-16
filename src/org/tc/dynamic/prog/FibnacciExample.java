package org.tc.dynamic.prog;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class FibnacciExample {
	
	static int powerOf2(int n){
		int power = 1;
		if(n<1){
			return 0;
		}
		for(int i=0; i<n;i++){
			power *= 2;
		}
		return power;
	}
	static int fib(int n){
		
		if(n == 0 || n == 1 ){
			return 1;
		}
		//System.out.println("fib("+(n-1)+")"+"+"+"fib("+(n-2)+")");
		return fib(n-1)+fib(n-2);
	}
	
    
    static void allFib(int n){
    	for (int i = 0; i < n; i++) {
			System.out.println(i+":"+fib(i));
		}
    }
    
    
	static int fib2(int n){
		if(n == 1){
			return 0;
		}if(n == 2 || n == 3){
			return 1;
		}
		
		int f1 = 0;
		int f2 = 1;
		int f3 = f1+f2;
		int count = 1;
		while(count < n){
			f1 = f2;
			f2 = f3;
			f3 = f2 + f1;
			count++;
		}
		return f3;
	}
	
	
	
	static int digitsSum(BigInteger n){
		int sum = 0;
		while(n.intValue()>0){
			sum += n.intValue()%10;
			n = BigInteger.valueOf(n.intValue()/10);
		}
		return sum;
	}
	public static void main(String[] args){
		
		int[] a = new int[Character.MAX_VALUE];
		int[] b = new int[Character.MAX_VALUE];
		String s1 = "转注字 / 轉注字123456";
		String s2 = "转注字 / 轉注字321564";
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		for(int i=0; i< s1.length(); i++){
			a[s1.charAt(i)] = a[s1.charAt(i)]+1;
			b[s2.charAt(i)] = b[s2.charAt(i)]+1;
		
		}
		boolean isPermutaion = true;
		for(int i = 0; i< a.length; i++){
			if(a[i] != b[i]){
				isPermutaion = false;
				break;
			}else if (a[i] != 0){
				System.out.println("a["+i+"]"+a[i]);
				System.out.println("b["+i+"]"+b[i]);
			}
		}
		System.out.println(" Is Permutaion "+ isPermutaion);
	}
}

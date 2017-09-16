package org.tc.anagram;

public class Polindrom {
	
	
    static boolean isPalindrome(int x) {
        int n = x;
        int rem,sum = 0;
        
        while(n>0){
            rem = n % 10;
            sum = sum*10+rem;
            n = n/10;
        }
        
        System.out.printf("sum is %d and x is %d \n",sum,x);
        if(sum == x){
            return true;
        }
        return false;
    }
	
	
	public static void main(String ...strings ){
		System.out.println(isPalindrome(454));
	}

}

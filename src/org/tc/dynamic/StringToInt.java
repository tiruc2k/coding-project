package org.tc.dynamic;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringToInt {

	
	
	
	@SuppressWarnings("unchecked")
	public static int thirdMax(int[] a) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<a.length;i++){
			set.add(a[i]);
		}
		List <Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		//System.out.println(list);
		return list.get(list.size()-3);
    }
	
	 public static String addBinary(String a, String b) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        int la = a.length();
	        int lb = b.length();
	        
	        int max = Math.max(la, lb);
	        
	        StringBuilder sum = new StringBuilder("");
	        int carry = 0;
	        
	        for(int i = 0; i < max; i++){
	            int m = getBit(a, i);
	            int n = getBit(b, i);
	            
	            int add = m + n + carry;
	            System.out.printf( "m value is %d,  n value is %d,  add value is %d,carry is %d\n",m,n,add,carry);
	            sum.append(add % 2);
	            carry = add / 2;
	        }
	        
	        if(carry == 1)
	            sum.append("1");
	        
	        return sum.reverse().toString();
	        
	    }
	    
	    public static int getBit(String s, int index){
	    	if(index < 0 || index >= s.length()){
	    		return 0;
	    	}
	    	//return s.charAt(index);
	        if(index < 0 || index >= s.length())
	            return 0;
	        
	        if(s.charAt(index) == '0')
	            return 0;
	        else
	            return 1;
	        
	    }
	
	public boolean isHappy(int n) {
        long number = n;
        HashSet<Long> cycle = new HashSet<Long>();
	       while(number != 1 && cycle.add(new Long(number))){
	           long m = 0;
	           while(number > 0){
	               long digit = (number % 10);
	               m += digit*digit;
	               number /= 10;
	           }
	           number = m;
	       }
	       return number == 1;
	}
	
	public int addDigits(int num) {
        if(num < 9){
            return num;
        }
        int sum = 0;
        while(num > 0){
            sum+=num %10;
            num/=10;
        }
        if(sum > 9)
        	return addDigits(sum);
        else{
        	return sum;
        }
    }
	   
    private BigInteger convertToBigInt(String num){
    	BigInteger sum = new BigInteger("0");
        for(int i=0 ; i< num.length(); i++){
            long digit = num.charAt(i) - 48; 
            //sum = sum*10+digit;
            sum = sum.multiply(new BigInteger("10"));
            sum = sum.add(new BigInteger(new Long(digit).toString()));
            
        }
        return sum;
    }
 
    public  String addStrings(String num1, String num2) {
        return convertToBigInt(num1).add(convertToBigInt(num2)).toString();
    }
    
    public static void main(String ... args){
    	StringToInt st = new StringToInt();
    	//System.out.println(st.addStrings("3876620623801494171","6529364523802684779"));
    	//System.out.println(st.addStrings("0", "0"));
    	//BigInteger bigInt = new BigInteger("1234765765756756768897897897897896775664564564");
    	//BigInteger bigInt1 = new BigInteger("1234765765756756768897897897897896775664564564");
    	//System.out.println(bigInt.add(bigInt1));
    	//System.out.println(st.addDigits(1234567656));
    	//System.out.println(happy(19));
    	//System.out.println(addBinary("111","101"));
    	int[] a ={2,2,3,1};
    	System.out.println(thirdMax(a));
    	
    	
    }
}

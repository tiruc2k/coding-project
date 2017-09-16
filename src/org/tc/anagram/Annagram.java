package org.tc.anagram;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Annagram {
	
	 public static boolean judgeSquareSum(int c) {
		 char[] c1 = new char[]{};
	        for(int i=1 ; i <=c ; i++)   {
			 	for(int j=i; j<=c; j++){
		            	System.out.println("("+i+","+j+")"+((i*i)+(j*j)) +":"+c);
		                if((i*i)+(j*j) == c){
		                    return true;
		                }
		                if(((i*i)+((j)*(j)))> c){
		                    break;
		                }
		            }
	        }
	      return false;
	    }
	 
	 public static int singleNumber(int[] nums) {
	        List<Integer> list = new ArrayList<>();
	        for(int i=0;i<nums.length;i++){
	        	Integer temp = nums[i];
	            if(!list.contains(temp)){
	                list.add(temp);
	            }else{
	                list.remove(temp);
	            }
	        }
	       return list.get(0); 
	    }
	 
	public static int getSum(int x, int y) {
		 // Iterate till there is no carry  
	    while (y != 0)
	    {
	        // carry now contains common set bits of x and y
	        int carry = x & y;  
	 
	        // Sum of bits of x and y where at least one of the bits is not set
	        x = x ^ y; 
	 
	        // Carry is shifted by one so that adding it to x gives the required sum
	        y = carry << 1;
	    }
	    return x;
    }
	 public static boolean isValid(String s){
		  Stack<Character> stack = new Stack<Character>();
			 for(int i = 0 ; i< s.length(); i++){
				 char ch = s.charAt(i);
				 if(ch == '[' || ch == '(' || ch == '{'){
					 stack.push(ch);
				 }
				 if(ch == ']' || ch == ')' || ch == '}'){
	                 if(stack.isEmpty()){
	                     return false;
	                 }
					 char topChar = stack.pop();
					 if( ch == ']'){
						 if (topChar != '['){
							 return false;
						 }
					 }
					 if( ch == '}'){
						 if( topChar != '{')
							 return false;
					 }
					 if( ch == ')'){
						  if (topChar != '(')
						   return false;
					 }
				 }
			 }
			 if(stack.isEmpty())
				 return true;
			return false; 
	 }
	 public static boolean isAnagram(String s, String t) {
	        if(s.length() != s.length()){
	            return false;
	        }
	        int[] s1 = new int[Character.MAX_VALUE];
	        int[] t1 = new int[Character.MAX_VALUE];
	        for(int i = 0 ; i < s.length() ; i++){
	        	System.out.println(s1[i]+","+t1[i]);
	            s1[s.charAt(i)]++;
	            t1[t.charAt(i)]++;
	        }
	      //  System.out.println(Arrays.toString(s1));
	       // System.out.println("\n"+Arrays.toString(t1));
	        for(int i = 0 ;i<s1.length; i++){
	            if(s1[i] != t1[i]){
	            	System.out.println("not equal");
	                return false;
	            }
	        }
	        return true;
	    }
	 
	 public static void main (String ...strings){
		// System.out.println(isAnagram("a","b") );
		 //System.out.println(isValid("()"));
		 //System.out.println(getSum(3,2));
		 int[] a = {2,2,1};
		// System.out.println(singleNumber(a));
		 System.out.println(judgeSquareSum(4));
	 }
}

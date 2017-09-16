package org.tc.dynamic;

import java.util.ArrayList;
import java.util.List;

public class FirstUniqCharacter {
	
	   public int firstUniqChar(String s) {
		   List<Character> list = new ArrayList<>();
		   int idx = -1;
		   char firstUniqChar = ' '; 
	       for(int i=0; i<s.length() ;i++){
	    	   if(!list.contains(s.charAt(i))){
	    		  idx = i;
	    		  firstUniqChar = s.charAt(i);
	    		  list.add(s.charAt(i));
	    	   }else{
	    		   if(firstUniqChar == s.charAt(i)){
	    			   idx = -1;
	    			   firstUniqChar = ' '; 
	    		   }
	    	   }
	       }
	       return idx;
	    }
	
	public static void main(String[] args){
		System.out.println(new FirstUniqCharacter().firstUniqChar("leetcode"));
	}

}


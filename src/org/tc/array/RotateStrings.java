package org.tc.array;

public class RotateStrings {
	
	static boolean isRotated(String s1,String s2){
		return (s1 != null && s2!= null && s1.length() == s2.length()) && ((s1+" "+s1).indexOf(s2) != -1);
		//return true;
	}
	
	static boolean isRotation(String s1, String s2) {
		   return (s1.length() == s2.length()) && (s1 + s2).matches("(.*)(.*)\\2\\1");
		}
	
	static boolean isRotation2(String s1 ,String s2){
		    //Step 1
	        if(s1.length() != s2.length())
	        {
	            return false;
	        }
	        else
	        {
	            //Step 2
	            String s3 = s1 +" "+ s1;
	            //Step 3
	            System.out.println(s3);
	            if(s3.contains(s2))
	            {
	                return true;
	            }
	            return false;
	        }
	}
	public static void main(String[] args){
		
		String s1 = "I am good  boy";
		String s2 = "boy I am good ";
		System.out.println(isRotated(s1, s2));
		System.out.println(isRotation(s1, s2));
		System.out.println(isRotation2(s1, s2));
	}

}

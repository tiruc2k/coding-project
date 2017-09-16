package org.tc.string;

public class ReverseString {
		
	public static String  reverse1(String str){
		// If str is null or length is one return the str as is
		if( str == null || str.length() == 1){
			return str;
		}else{
			return str.substring(str.length()-1)+reverse1(str.substring(0, str.length()-1));
		}
	}
	
	public static String reverse2(String str){
		// If str is null or length is one return the str as is
		if(str == null || str.length() == 1){
			return str;
		}
		char[] charArray = str.toCharArray();
		char temp;
		for(int i=0,j=str.length()-1; i < j; i++,j--){
			  temp = charArray[i];
			  charArray[i] = charArray[j];
			  charArray[j] = temp;
		}
		return new String(charArray);
	}
	
	public static String reverse3(String str){
		if(str == null || str.length() == 1){
			return str;
		}
		StringBuffer sb = new StringBuffer();
		for (int i=str.length()-1; i >=0; i--){
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	public static String reverseWords(String str){
		if(str == null || str.length() == 1){
			return str;
		}
		StringBuffer sb = new StringBuffer();
		String[] strTokens = str.split(" ");
		System.out.println("strTokens :"+strTokens);
		for (String token : strTokens){
			System.out.println("token:"+token);
			sb.append(reverse1(token)+" ");
		}
		return sb.toString();
	}
	
	public static boolean isStringContainsDigit(String str){
		//String digitString = "0123456789";
		for(char c: str.toCharArray()){
			if(Character.isDigit(c)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		System.out.println(reverse1("Hello"));
		System.out.println(reverse2("Hello"));
		System.out.println(reverse3("Hello"));
		System.out.println(isStringContainsDigit("Hello World! 	the"));
	}

}

package org.tc.dynamic;

public class DigtsSum {
	
	
	static boolean isDigit(Character ch){
		return Character.isDigit(ch);
	}
	
	public static int digitSum(String inputStr){
		int sum = 0;
		for(Character ch : inputStr.toCharArray()){
			sum+= (Character.isDigit(ch) == true ? ch-48 : 0);
		}
		return sum;
	}
	
	public static String removeCharacters(String inputStr){
		if(inputStr == null){
			return null;
		}
		inputStr = inputStr.toLowerCase();
		String firstChar = (inputStr.length() > 0 && inputStr.charAt(0) == 'a') ?  "a" : "";
		String secondChar = (inputStr.length() > 1 && inputStr.charAt(1) == 'b') ?  "b" : "";
		String remaining = (inputStr.length() > 2 ) ?  inputStr.substring(2) : "";
		return firstChar+secondChar+remaining;
	}
	
	public static String removeConsecutiveCharacters(String input, int rep){
		StringBuffer retStr = new StringBuffer(); 
		char prevChar = input.charAt(0);
		retStr.append(input.charAt(0));
		int count = 1;
		for(int i=1 ; i<input.length(); i++){
			char temp = input.charAt(i);
			if(temp == prevChar){
				count++;
			}else{
				count = 1;
			}
			if(count <= rep){
				retStr.append(temp);
			}
			prevChar = temp;
		}
		
		return retStr.toString();
	}
	
	
	public static void main(String ... args){
		System.out.println(digitSum("1 some text 2 more text 4 more text 8"));
		System.out.println(removeCharacters("abcd"));
		System.out.println(removeCharacters("Absolute"));
		System.out.println(removeCharacters("Ant"));
		System.out.println(removeCharacters("ubiquitous"));
		System.out.println(removeConsecutiveCharacters("aaab", 2));
		System.out.println(removeConsecutiveCharacters("aaaabbbb", 3)); 
		System.out.println(removeConsecutiveCharacters("aabbbcccc", 1)); 
		System.out.println(removeConsecutiveCharacters("aabbabcccc", 2));
		
	}

}

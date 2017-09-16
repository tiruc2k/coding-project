package org.tc.string;

public class StringToInteger {
	
	static int convertToInt(String s){
		int sum = 0;
		char firstChar = ' ';
		for (int i=0 ; i< s.length();i++){
			if (i == 0 && (s.charAt(i) == '+' || s.charAt(i) == '-')){
				firstChar = s.charAt(i);
				continue;
			}
			sum = sum * 10 + (s.charAt(i)-48);
		}
		if (firstChar == '-'){
			sum = (-1 * sum);
		}
		return sum;
	}
	public static void main(String[] args){
		System.out.println(convertToInt("-1"));
	}

}

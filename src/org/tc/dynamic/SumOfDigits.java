package org.tc.dynamic;

public class SumOfDigits {
	
	static int sum(int n){
		if(n==1){
			return 1;
		}
		return n+sum(n-1);
	}
	
	static int fact(int n){
		if(n == 1){
			return 1;
		}
		return n * fact(n-1);
	}
	
	boolean isDigit(char c){
		String digitString = "1234567890";
		for(char x : digitString.toCharArray()){
			if(c == x){
				return true;
			}
		}
		return false;
	}
	
	int sumofDigits(String s){
		int sum = 0;
		for(int i=0; i<s.length();i++){
			if(isDigit(s.charAt(i))){
				sum+=(int)s.charAt(i)-48;
			}
		}
		return sum;
	}
	
	public static void main(String...strings){
		System.out.println(new SumOfDigits().sumofDigits("ab2c23"));
		System.out.println(sum(10));
		System.out.println((fact(5)));
	}

}

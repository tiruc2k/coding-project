package org.siri;

public class StringArray {

	private static void printArray(String[] s1){
		System.out.println();
		for(int i=0; i < s1.length; i++){
			if(i == s1.length-1)
				System.out.print(s1[i]);
			else
				System.out.print(s1[i] + ",");
		}
	}
	public static void main(String[] args){
		String[] s = new String[5];
		s[0] = "aaa";
		s[1] = "bbb";
		s[2] = "ccc";
		s[3] = "ddd";
		s[4] = "eee";
		String[] s1= new String[s.length/2];
		
		String[] s2= new String[s.length/2+1];
		int j=0;
		int k=0;
		for(int i=0; i<s.length;i++){
			if(i%2 != 0){
				s1[j++] = s[i];
			}else{
				s2[k++] = s[i];
			}
		}
	
		printArray(s1);
		printArray(s2);
		
	}
}

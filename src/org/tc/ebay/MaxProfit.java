package org.tc.ebay;

public class MaxProfit {
	
	static int maxProfit(int[] a){
		if(a == null || a.length == 0){
			return 0;
		}
		int pPrice = a[0];
		int sPrice = a[1];
		int profit = sPrice - pPrice;
		for(int i=0; i < a.length; i++){
			for(int j=i+1; j < a.length; j++){
				if(a[j]-a[i] > profit){
					pPrice = a[i];
					sPrice = a[j];
					profit = a[j]-a[i];
				}
			}		
		}
		return profit;
	}
	
	static boolean isRotation(String s1,String s2){
		if(s1 == null || s2 == null | s1.length() != s2.length()){
			return false;
		}
		return (s1+" "+s1).contains(s2);
	}
	
	public static void main(String[] args){
		int[] a = {10,20,30,25,40,50,89,6,90,92};
		System.out.println(maxProfit(a));
		String s1 = "I am good boy";
		String s2 = "good boy I am";
		System.out.println(isRotation(s1,s2));
	}

}

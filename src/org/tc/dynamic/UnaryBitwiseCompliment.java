package org.tc.dynamic;

public class UnaryBitwiseCompliment {
	
	
		public static int findComplement(int n) {
	        if(n == 0 ){
				return 1;
			}
			StringBuffer sb = new StringBuffer();
			while(n>0){
				sb.append(n%2);
				n=n/2;
			}
			sb.reverse();
			StringBuffer sb1 = new StringBuffer();
			for(int i=0; i< sb.length(); i++){
				sb1.append(sb.charAt(i)  == '1' ? '0' : '1');
			}
	        sb1.reverse();
	        int sum = 0;
	        for(int i = 0; i<sb1.length(); i++ ){
	            int x = sb1.charAt(i) - '0';
	            sum += x* Math.pow(2,i);
	        }
			return sum;
	    }
	
	public static void main(String ...strings ){
		int a = 4;
		System.out.println(findComplement(a));
	}

}

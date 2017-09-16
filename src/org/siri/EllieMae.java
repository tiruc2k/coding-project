package org.siri;

public class EllieMae {
	
	
	public static int[] insertNewElement(int[] a, int pos, int elem){
		int j = 0;
		int[] temp = new int[a.length+1];
		for( int i=0; i< a.length; i++){
			if(i == pos-1){
				temp[j++] = elem;
			}
			temp[j++] = a[i];
		}
		return temp;
	}
	
	public static void printArray(int[] a){
		System.out.println();
		for(int x :a){
			System.out.print(" "+x);
		}
	}
	
	public static int fibonacci(int number){
		System.out.print(" "+ number);
		if(number == 1 || number == 2)
		{ 
			return 1; 
		} 
		System.out.println();
		return fibonacci(number-1) + fibonacci(number -2); 
	}

	
	public static void main(String... args){
		int[] a = {10,20,30,40,50};
		printArray(a);
		a=insertNewElement(a, 3 ,100);
		printArray(a);
		fibonacci(8);
	}

}

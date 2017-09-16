package org.tc.number;

import java.math.BigInteger;

import java.util.*;

//Java code for thread creation by extending
//the Thread class
class MultithreadingDemo extends Thread
{
 public void run()
 {
     try
     {
         // Displaying the thread that is running
         System.out.println ("Thread " +
               Thread.currentThread().getName()+","+Thread.currentThread().getId()+
               " is running");

     }
     catch (Exception e)
     {
         // Throwing an exception
         System.out.println ("Exception is caught");
     }
 }
}

//Main Class
 class Multithread
{
 public static void main(String[] args)
 {
     int n = 8; // Number of threads
     for (int i=0; i<8; i++)
     {
         MultithreadingDemo object = new MultithreadingDemo();
         object.start();
     }
 }
}
class Palettedos{
    private static Scanner Z = new Scanner(System.in);
    public static final double pi = 3.142;
    public static void main(String[]args){    
        Palettedos A = new Palettedos();
        System.out.println("Enter the base and height of the triangle respectively");
        int base = Z.nextInt();
        int height = Z.nextInt();
        System.out.println("Enter the radius of the circle");
        int radius = Z.nextInt();
        System.out.println("Enter the length of the square");
        long length = Z.nextInt();
        double tArea= A.calculateArea(base,height);
        double cArea= A.calculateArea(radius);
        long sqArea= A.calculateArea(length);
        System.out.println("The area of the triangle is\t"+tArea);
        System.out.println("The area of the circle is\t"+cArea);
        System.out.println("The area of the square is\t"+sqArea);
    }
    double calculateArea(int base, int height){
        double triArea=0.5*base*height;
        return triArea;   
    }
    double calculateArea(int radius){
        double circArea=pi*radius*radius;
        return circArea;   
    }
    long calculateArea(long length){
        long squaArea=length*length;
        return squaArea;

    }
}

public class MissingNumber {
	
	public static void test(){
		System.out.println(Byte.BYTES);
		System.out.println(Character.BYTES);
		System.out.println(Integer.BYTES);
		System.out.println(Float.BYTES);
		System.out.println(Long.BYTES);
		System.out.println(Double.BYTES);
		System.out.println(BigInteger.ONE);
	}
	
	public static int missingNumber(int[] nums){
		int sum = 0;
		int n = nums.length+1;
		for(int i = 0; i< nums.length; i++){
			sum+=nums[i];
		}
		return (n*(n+1))/2 - sum;
	}
	
	public static void main(String[] args){
		test();
	}

}

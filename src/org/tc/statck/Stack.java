package org.tc.statck;

public class Stack {
	
	int MAX = 10;
	int[] a = new int[MAX];
	int top;
	
	Stack(){
		top = 0;
	}
	
	public boolean push(int item){
		if(top >= MAX){
			System.out.println("Stack is full");
			return false;
		}else{
			a[top++] = item;
		}
		return true;
	}
	
	public int peek(){
		
		if(top < 0){
			System.out.println("Stack is empty");
			return -1;
		}
		return a[top--];
	}
	
	public boolean isEmpty(){
		return (top < 0);
	}
	
	public int pop(){
		--top;
		if(top < 0){
			System.out.println("Stack is underflow");
			return 0;
		}
		return a[top];
	}
	
	public static void main(String ...strings ){
		Stack stack = new Stack();
		stack.push(1);stack.push(2);stack.push(3);stack.push(4);stack.push(5);
		stack.push(6);stack.push(7);stack.push(8);stack.push(9);stack.push(10);stack.push(11);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	

}

package org.tc.queue;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MyQueue {

	public static void reverseQueue(BlockingQueue queue) throws InterruptedException{
		Stack stack = new Stack();
		while(!queue.isEmpty()){
			stack.push(queue.poll());
			//queue.remove();
		}
		while(!stack.isEmpty()){
			queue.put(stack.pop());
			//stack.pop();
		}
	}
	
	public static void main(String...strings) throws InterruptedException{
		BlockingQueue queue = new LinkedBlockingDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		System.out.println(queue);
		reverseQueue(queue);
		System.out.println(queue);
		queue.clear();
		System.out.println(queue);
	}
	
}

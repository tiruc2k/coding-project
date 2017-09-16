package org.tc.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackImplQueue {
	
	Queue<Integer> queue;
	Queue<Integer> temp;
	
	StackImplQueue(){
		queue = new LinkedList<Integer>();
		temp = new LinkedList<Integer>();
	}

	public void push(int data){
		if(queue.isEmpty()){
			queue.add(data);
		}else{
			while(queue.isEmpty()){
				temp.add(queue.remove());
			}
			queue.add(data);
			while(temp.isEmpty()){
				queue.add(temp.remove());
			}
		}
	}
	
	public int pop(){
		if (queue.isEmpty())
            throw new NoSuchElementException("Underflow Exception");
		return queue.remove();
	}
	
	public boolean empty(){
		return queue.isEmpty();
	}
	
	public int top(){
		if (queue.isEmpty())
            throw new NoSuchElementException("Underflow Exception");
		return queue.peek();
	} 
}

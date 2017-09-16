package org.tc.dynamic;
/**
 * Definition for singly-linked list.
 */
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class InterSectNode {
	int getCount(ListNode node){
		int count = 0;
		while(node != null){
			count++;
			node = node.next;
		}
		return count;
	}
	
	ListNode getIntesectionNode(int d, ListNode node1, ListNode node2){
		
		for(int i =0 ; i < d ; i++){
			if(node1 == null){
				return null;
			}
			node1 =node1.next;
		}
		while(node1 != null && node2 !=null){
			if(node1.val == node2.val){
				return node1;
			}
			node1 = node1.next;
			node2 = node2.next;
		}
		return node1;
		
	}
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	
    	int c1 = getCount(headA);
    	int c2 = getCount(headB);
    	int d;
    	if(c1 > c2){
    		d = c1 - c2;
    		return getIntesectionNode( d,  headA,  headB);
    	}else{
    		d = c2 - c1;
    		return getIntesectionNode( d,  headB,  headA);
    	}
    	
        
    }
}
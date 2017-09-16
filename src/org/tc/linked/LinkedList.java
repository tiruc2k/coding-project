package org.tc.linked;

public class LinkedList<T> {
	
	static class Node<T>{
		Node<T> link;
		T item;
		Node(T i){
			this.item = i;
			this.link = null;
		}
		public String toString(){
			return item +" --> "+link;
		}
	}
	
	Node<T> head;
	
	public void add(T a){
		if(head == null){
			head = new Node<T>(a);
		}else{
			Node<T> tmp = head;
			while(tmp.link != null){
				tmp = tmp.link;
			}
			tmp.link = new Node<T>(a);
		}
	}
	
	public void display(){
		Node<T> tmp = head;
		while(tmp != null){
			if(tmp.link == null){
				System.out.println(tmp.item);
			}else{
			   System.out.print(tmp.item + ",");
			}
			tmp = tmp.link;
		}
	}
	
	public boolean find(T a){
		Node<T> tmp = head;
		while(tmp !=null){
			if(tmp.item == a){
				return true;
			}
			tmp = tmp.link;
		}
		return false;
	}
	
	public void delete(T a){
		Node<T> tmp = head;
		if(tmp !=null & tmp.link == null){
			if (tmp.item == a) {
				head = null;
				return;
			}
		}
		while(tmp != null){
			if(tmp.item == a){
				if(tmp.link == null){
					break;
				}
				tmp.link = tmp.link.link;
				return;
			}
			tmp = tmp.link;
		}
	}
	
	public Node<T> middleNode(){
		Node<T> slowPtr = head;
		Node<T> fastPtr = head;
		if(head == null) {
			return null;
		}
		if( head.link == null){
			return head;
		}
		while(fastPtr.link != null){
			fastPtr = fastPtr.link.link;
			if(fastPtr == null){
				break;
			}
			slowPtr = slowPtr.link;
		}
		return slowPtr;
	}
	
	
	public Node<T> getNthNode(int n){
		  Node<T> tmp = head;
		  if( tmp == null){
			  return null;
		  }
		  int count = 0;
		  while(tmp != null){
			  count++;
			  if(count == n){
				  return tmp;
			  }
			  
			  tmp = tmp.link;
		  }
		  return null;
	  }
	
	  public int getLength(){
		  Node<T> tmp = head;
		  int length = 0;
		  while(tmp != null){
			  tmp = tmp.link;
			  length++;
		  }
		  return length;
	  }
	  
	  public static int getLengthRecursive( Node<Integer> node){
		  if( node == null){
			  return 0;
		  }
		  return 1 + getLengthRecursive(node.link);
	  }
	  
	  public static int getSumRecursive( Node<Integer> node){
		  if( node == null){
			  return 0;
		  }
		  return node.item + getSumRecursive(node.link);
	  }
	  
	  public static  boolean searchElement( Node<Integer> node, Integer item){
		  if( node == null){
			  return false;
		  }else{
			  if(node.item == item){
				  return true;
			  }
		  }
		  return searchElement(node.link,item);
	  }
	  
	  public static Integer getNthElement(Node<Integer> node, Integer n, Integer count){
		  if(node == null){
			  return null;
		  }
		  System.out.println("Count :" + count+" n :" + n);
		  if(count == n){
			  return node.item;
		  }
		 return getNthElement(node.link,n,count++);
	  }
		  
	  public static Integer getNthElement(Node<Integer> node, Integer n){
		 return getNthElement(node,n,1);
	  }
	  
	  public static int compare(Node<Integer> node1, Node<Integer> node2){
		  
		  if( node1 == null && node2 == null)
		  {
			  return 0;
		  }
		  while( node1 != null && node2 != null && node1.item == node2.item){
			  node1 = node1.link;
			  node2 = node2.link;
		  }
		  if(node1 != null && node2 != null){
			  return (node1.item > node2.item ? 1 :-1);
		  }
		  if(node1 != null && node2 == null){
			  return 1;
		  }
		  if(node1 == null && node2 != null){
			  return -1;
		  }
		 return 0;
	  }
	  
	  public  void reverse(){
		  Node temp = head;
		  
	  }
	  
	public static void main(String ...strings ){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.display();
/*		System.out.println(list.getNthNode(1));
		System.out.println(list.getNthNode(2));
		System.out.println(list.getNthNode(3));
		System.out.println(list.getNthNode(4));
		System.out.println(list.getNthNode(5));
		list.display();
		System.out.println(list.middleNode().item);
		System.out.println(list.getLength());
		System.out.println(getLengthRecursive(list.head));
		System.out.println(getSumRecursive(list.head));
		System.out.println(searchElement(list.head,10));
		System.out.println(searchElement(list.head,70)); */
		System.out.println(getNthElement(list.head,1));
	}

}

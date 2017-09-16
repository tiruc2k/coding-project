package org.siri;

import java.util.Stack;


enum RoundingMode{
	   DOWN;
		
	}
class Test {
	
	
	public static void eval(){
		
		 System.out.println((Integer) 10 == Integer.valueOf("10"));
		 System.out.println(RoundingMode.DOWN == RoundingMode.DOWN);
		 System.out.println("abc" == "abc");
		 System.out.println("abc" == "ab" + "c");
	}
    public static void main(String args[]){
        String input=args[0];
        //boolean isFra = checkBrackets(input);
        eval();
       // System.out.println("isFra..."+isFra);
    }

    public static boolean  checkBrackets(String input){ 
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<input.length();i++){
            char c = input.charAt(i);
            if( c == '[' ||  c == '(' || c == '{'){
                  stack.push(c);
             }else if (c == ']'){
                if (stack.isEmpty())
                         return false;
                if( stack.pop() != '[')
                        return false;
            }else if (c == ')'){
                if (stack.isEmpty())
                         return false;
                if(stack.pop() != '(')
                        return false;
            }else if (c == '}'){
                if (stack.isEmpty())
                         return false;
                if( stack.pop() != '{')
                        return false;
            }
       }// end of for loop
       return stack.isEmpty();
    }// end of the method
}
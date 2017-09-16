package org.tc.hack;
import java.util.Stack;
public class Solution {
	
	Stack<Character> charStack = new Stack<Character>();
	
	public  String balance(String inputStr){
		
		if(inputStr == null){
			return null;
		}
		StringBuffer sb = new StringBuffer();
		int openIdx = 0;
		int closedIdx = 0;
		for(int i = 0 ; i< inputStr.length(); i++){
			char c = inputStr.charAt(i);
			// check for opening parenthesis
			if( c == '('){
				charStack.push(c);
				sb.append(c);
				openIdx++;
			// check for closed parenthesis
			}else if (c == ')'){
				if(charStack.isEmpty()){
					continue;
				}
				char temp = charStack.pop();
				if(temp == '('){
					sb.append(c);
					closedIdx++;
				}
			// other then open & closed parenthesis
			}else{
				sb.append(c);
			}
		}
		System.out.println(openIdx+","+closedIdx);
		if(openIdx > closedIdx){
			sb.deleteCharAt(sb.lastIndexOf("("));
		}
		return sb.toString();
	}
 
    public static void main(String[] args) {
       System.out.println(new Solution().balance("()"));
       System.out.println(new Solution().balance(")()"));
       System.out.println(new Solution().balance("(abc))()"));
       System.out.println(new Solution().balance("(abc)))())()(a"));
       System.out.println(new Solution().balance(")()))(abc)))())()(a"));
    }
}
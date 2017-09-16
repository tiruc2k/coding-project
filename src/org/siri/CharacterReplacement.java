package org.siri;

import java.util.ArrayList;
import java.util.List;

public class CharacterReplacement {
	
	//Method to replace digit with given character
	/**
	 * @param inputStr
	 * @param ch
	 * @return
	 */
	public static String replaceDigit(String inputStr, Character ch){
		List<? extends Number> list = new ArrayList<Integer>();
		list = (List<? extends Number>) list.iterator();
		if(inputStr == null){
			return null;
		}
		StringBuffer sb = new StringBuffer();
		char[] charArray = inputStr.toCharArray();
		for(char c :charArray){
			if (Character.isDigit(c)){
				sb.append(ch);
			}else{
				sb.append(c);
			}
			
		}
		return sb.toString();
	}
	//Method to replace  character(charToRepalce) with another character ( replacement character)
	/**
	 * @param inputStr
	 * @param charToRepalce
	 * @param repCharacter
	 * @return
	 */
	public static String replaceCharacer(String inputStr, Character charToRepalce,Character repCharacter){
		if(inputStr == null){
			return null;
		}
		StringBuffer sb = new StringBuffer();
		char[] charArray = inputStr.toCharArray();
		for(char c :charArray){
			if (c == charToRepalce){
				sb.append(repCharacter);
			}else{
				sb.append(c);
			}
		}
		return sb.toString();
	}
	//Method to replace string with given string
	/**
	 * @param inputStr
	 * @param stringToRepalce
	 * @param repString
	 * @return
	 */
	public static String replaceString(String inputStr, String stringToRepalce,String repString){
		if(inputStr == null){
			return null;
		}
		return inputStr.replaceAll(stringToRepalce, repString);
	}
	
	public static void main(String[] args){
		
		String inputString = "Hello World 123";
		System.out.println(replaceDigit(inputString,'S'));
		System.out.println(replaceCharacer(inputString,'1', 'S'));
		System.out.println(replaceString(inputString,"World","abc"));
		
	}

}

package org.tc.anagram;

import java.util.Arrays;

class Logger{
	
	public static boolean enableLoging = false;
   	
	public static int SEVERITY_ERROR = 3;
	public static int SEVERITY_WARN = 2;
	public static int SEVERITY_INFO = 1;
	
	public static void logInfo(Object o){
		if(enableLoging){
			System.out.println(o.toString());
		}
	}
	
	public static void logWarn(Object o){
		if(enableLoging){
			System.out.println(o.toString());
		}
	}
	
	public static void logError(Object o){
		if(enableLoging){
			System.err.println(o.toString());
		}
	}
	
	private static Logger logger;
	
	private Logger(){
	
	}
	
	private static Object lock = new Object();
	
	public static Logger getInsance(){
		synchronized(lock){
			if(logger == null ){
				logger = new Logger();
			}
		}
		return logger;
	}
}
public class Anagram {
	
	static boolean isAnagram(String s1,String s2){
		
		if(s1 == null || s2 == null || s1.length() != s1.length()){
			return false;
		}
		int[] a1 = new int[256];
		int[] a2 = new int[256];
		
		for(int i=0; i<s1.length();i++){
			Logger.logInfo(s1.charAt(i) +":"+s2.charAt(i));
			a1[s1.charAt(i)]++;
			a2[s2.charAt(i)]++;
		}
		Logger.logInfo(Arrays.toString(a1));
		Logger.logInfo(Arrays.toString(a2));
		for(int i=0;i<a1.length;i++){
			if(a1[i] != a2[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String ...strings ){
		System.out.println(isAnagram("iceman","cinema"));
		System.out.println(isAnagram("iceman2345","cinema1223"));
	}

}

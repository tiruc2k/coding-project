package org.tc.longestsub;

import java.util.HashSet;
import java.util.Set;

public class LongestSubSequence {
	public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while (j < s.length()) {
        	//System.out.println(set);
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
	
	public static void main(String ...strings ){
		System.out.println(lengthOfLongestSubstring("bbb"));
		System.out.println(lengthOfLongestSubstring("abbccaabbcbb"));
	}

}

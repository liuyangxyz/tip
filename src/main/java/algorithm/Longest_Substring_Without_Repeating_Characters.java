package algorithm;

import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String arg[]){
        long start=System.currentTimeMillis();
        System.out.println(new Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring("abcabcab"));
        System.out.println(System.currentTimeMillis()-start);
    }
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==1){
            return 1;
        }
        int max=length(s,0);
        for (int i=1;i<s.length()-1;i++){
            max=Math.max(max,length(s,i));
        }
        return max;
    }
    public int length(String s,int j){
        int len=s.length();
        Set<Character> list=new HashSet<>();
        while (j<len && !list.contains(s.charAt(j))){
            list.add(s.charAt(j));
            j++;
        }
        return list.size();
    }
}
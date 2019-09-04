//Link:https://codezen.codingninjas.in/practice/470/746/first-non-repeating-character

import java.util.*;

/*
	- You are given a string, that can contain repeating characters.
	- Your task is to return the first character in this string that does not repeat. i.e., occurs exactly once
	- The string will contain characters only from English alphabet set, i.e., ('A' - 'Z') and ('a' - 'z');

*/

public class FirstNonRepeat 
{
	public static char firstNonRepeatingChar(String str)
	{
		Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i),mp.get(str.charAt(i))+1);
            }else{
                mp.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str.length();i++){
            if(mp.get(str.charAt(i))==1){
                return str.charAt(i);
            }
        }
		return str.charAt(0);
	}
}

//Link:https://codezen.codingninjas.in/practice/467/65/compress-the-string
/*
Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
For e.g. if a String has 'x' repeated 5 times, replace this "xxxxx" with "x5".
*/
import java.util.*;

public class Solution {

	public static String compress(String inputString) {
      String str="";
    	int length=inputString.length();
        int counter=1;
        for(int i=0;i<length-1;i++){
            if(inputString.charAt(i)==inputString.charAt(i+1)){
                counter++;
                continue;
            }else if(counter==1){
                str=str+inputString.charAt(i);//not concatenating counter if =1
                counter=1;
            }else{
                str=str+inputString.charAt(i)+counter;
                counter=1;//setting counter=1 for every new element we found
            }
        }
        //for the last element:
        //if counter=1 then means there was no matching with prev element
        //if counter!=1 then means match with the prev element hence we need
        //to show the counter which is >1
        if(counter==1){
            str=str+inputString.charAt(inputString.length()-1);
        }else{
            str=str+inputString.charAt(inputString.length()-1)+counter;
        }
        return str;
	}
}

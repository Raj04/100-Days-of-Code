//Link:https://codezen.codingninjas.in/practice/465/358/all-consecutive-elements
/*
Given an unsorted array of numbers, write a function that returns true if complete array consists of consecutive numbers. That means if we sort the array, all the elements are consecutive. Array contains only positive numbers.
Try doing it in O(n), where n is the size of given array.
*/
import java.util.*;

public class ConsecutiveElements {

	// input - input array
	public static boolean containsConsecutiveNumbers(int[] input){
		// Write your code here		
		if(input.length==1){
            return true;
        }
        
        Set<Integer> hashSet=new HashSet<>();
        int max=input[0],min=input[0];
        hashSet.add(input[0]);
        boolean flag=false;
        for(int i=1;i<input.length;i++){
        	hashSet.add(input[i]);
            if(max<input[i]){
                max=input[i];
            }
            if(min>input[i]){
                min=input[i];
            }
        }
//      System.out.println(max+" "+min+" "+hashSet.size());
        for(int i=min;i<=max;i++){
            if(hashSet.contains(i)){
                flag=true;
            }else{
               flag=false;
               break;
            }
        }
        return flag;
	}
}

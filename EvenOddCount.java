//Problem link:https://codezen.codingninjas.in/practice/470/2289/even-odd-count
//Statement: Count the number of distinct elements with even and odd occurrences in the given array. Display odd count first and then even count.


import java.util.*;

public class EvenOddCount{
	
	public static void FindOccurance(int[] arr, int size) {
		
        //adding all the values to the map with the values of count
        Map<Integer,Integer> mp=new HashMap<>();
        int even_count=0,odd_count=0;
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        //tracking of even and odd count seperately
        for (Map.Entry<Integer,Integer> entry : mp.entrySet()){
           	int x=entry.getValue();
            if(x%2==0){
                even_count++;
            }else{
                odd_count++;
            }
        }
        System.out.print(odd_count+" "+even_count);
	}
	
}

//Problem: https://codezen.codingninjas.in/practice/470/2290/distinct-left
//Find the number of distinct elements left after removing K maximum elements from the given array.

import java.util.*;

public class DistinctLeft {
	
	public static int FindDistinctCount(int[] arr, int n,int k) {
		
        //converting int[]to Integer[]
        Integer[] what = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
        Set<Integer> set=new HashSet<>();
        Arrays.sort(what,Collections.reverseOrder());
        for(int i=k;i<n;i++){
            //adding only after kth max elements
            set.add(what[i]);
        }
        //since set will not allow duplicates so printing the size of it  
		return set.size();
	}
	
}

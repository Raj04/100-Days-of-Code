//Problem: https://codezen.codingninjas.in/practice/470/2290/distinct-left
//Find the number of distinct elements left after removing K maximum elements from the given array.

import java.util.*;

public class DistinctLeft {
	
	public static int FindDistinctCount(int[] arr, int n,int k) {
		/*Your class should be named solution. 
		*Don't write main().
		*Don't take input, it is passed as function argument.
		*Don't print output.
		*Taking input and printing output is handled automatically.
		*/ 
        Integer[] what = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
        Set<Integer> set=new HashSet<>();
        Arrays.sort(what,Collections.reverseOrder());
        for(int i=k;i<n;i++){
            set.add(what[i]);
        }
        
		return set.size();
	}
	
}

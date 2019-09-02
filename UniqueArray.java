//Link:https://codezen.codingninjas.in/practice/470/2291/make-unique-array
//The problem can also be solved if we count no of duplicates in an array
//so the no. of duplicates we have to remove to make the array unique

import java.util.*;
import java.lang.Math.*;

public class UniqueArray {
	public static int CountExtraElements(int arr[], int n) {
		/*Your class should be named solution. 
		*Don't write main().
		*Don't take input, it is passed as function argument.
		*Don't print output.
		*Taking input and printing output is handled automatically.
		*/ 
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        if(set.size()!=n){
            return (n-set.size());
        }   
		return -1;
	}
}

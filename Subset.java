//Link:https://codezen.codingninjas.in/practice/470/2298/check-subset
//

import java.util.*;

public class Subset {
	
	public static boolean CheckSubset(int[] arr1, int n1, int[] arr2, int n2) {
	
        int counter=0;
	Set<Integer> set=new HashSet<>();
        for(int i=0;i<n1;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            if(set.contains(arr2[i])){
                counter++;
            }
        }
	//we have to compare with set size() as the no of elements matched with the first has to be same 
	//as well as in the number of count also
	/*3
	8 18 8
	3 
	8 8 8 --->in this 8 is matched but it is not a subset as the no of 8 count is not same
	in the first its only 2 other one has 3 instead, so we have to keep a track of count also
	since HashSet contains only unique so we compare with the size() to check exact subset is there or not.
	*/
        if(counter==set.size()){
            return true;
        }
        return false;
	}

	
}

//Link:https://codezen.codingninjas.in/practice/465/25/duplicate-in-array

//Time  limit exceeded when used hashmap.

import java.util.*;

public class DuplicateInArray{	

	public static int duplicate(int[] a){  
        
//         int x=0;
//         Map<Integer,Integer> mp=new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             if(mp.containsValue(arr[i])){
//                 x= arr[i];
//                 break;
//             }
//             mp.put(i,arr[i]);
//         }
//         return x;
		HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<a.length;i++){
            if (! hashSet.contains(a[i])) {
                hashSet.add(a[i]);
            } else {
                return a[i];
            }
        }
        return -1;
	}
}

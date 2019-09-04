//Link:https://codezen.codingninjas.in/practice/470/747/maximum-distance

import java.util.*;

/*
	- You are given an integer array, that can contain duplicate elements.
	- You have to return the maximum possible distance between two repeating elements having same value.

	- For example :-
		arr = [1, 3, 1, 4, 5, 6, 4, 8, 3];
		
		index0 = 1
		index1 = 3
		index2 = 1
		index3 = 4
		index4 = 5
		index5 = 6
		index6 = 4
		index7 = 8
		index8 = 3
		
		In the above array, the repeating elements are :- (1, 3, 4)
		- Distance bw first and last occurence of 1 = 2(index2 - index0)
		- Distance bw first and last occurence of 3 = 7(index8 - index1)
		- Distance bw first and last occurence of 4 = 3(index6 - index3)

		So, for the above array you must return 7, as this is maximum possible distance between two repeating elements having same value.

	- If there are no duplicate elements in the array, return 0.

*/

public class MaximumDistance 
{
	public static int maxDistance(int a[])
	{
		Map<Integer,Integer> mp=new HashMap<>();
        int max=0;
        for(int i=0;i<a.length;i++){
            if(mp.containsKey(a[i])){
                if((i-mp.get(a[i]))>max){
             	   max=i-mp.get(a[i]);
            	}
                //we can't modify the index(value) in the map as it might happen that
                //the elements are repeated more than twice, so it can have the longest length
                //with the third element so we don't change the index in the map we go with the same.
                mp.put(a[i],mp.get(a[i]));
            }else{
                mp.put(a[i],i);
            }	
        }
        if(max>0){
            return max;
        }
		return 0;
	}
}

//Given an array with both +ive and -ive integers, return a pair with highest product.
//Input: arr[] = {1, 4, 3, 6, 7, 0}  
//Output: {6,7} 

import java.util.*;

class MaxProduct {
	public static void main (String[] args) {
	    
	   int arr[]={1,4,3,6,7,0};
	   int mult=1;
	   //System.out.println(arr[0]);
	   Set<Integer> set=new HashSet<>();
	   for(int i=0;i<arr.length;i++){
	       set.add(arr[i]);
	   }
	   int index=0;
	   for(Integer i:set){
	       if(i*arr[index]>mult){
	           mult=i*arr[index];
	           index++;
	       }else{
	           index++;
	       }
	   }
	   System.out.println(mult);
	}
}

/*An efficient solution could be sort the array approach
*/

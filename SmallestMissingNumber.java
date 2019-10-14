//Find the smallest missing number in the array

import java.util.*;

class SmallestMissingNumber {
	public static void main (String[] args) {
        
        int arr[]={0,1,2,3,4,5,6,11,13};    
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int count=0;
        do{
            if(!set.contains(count)){
               System.out.println("Smallest missing number is "+count);
               break;
            }
            count++;
        }while(count!=0); 
	}
}

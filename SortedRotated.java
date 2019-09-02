//Link:https://codezen.codingninjas.in/practice/128432/3796/interview-shuriken-20:-sorted-and-rotated-array
//Excellent learning and application of binary search

import java.util.Scanner;

public class SortedRotated {

	//duplicates are not handled here 
	public static void main(String[] args) {
        
		// Write your code here
		Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
       	int pivot_index=0;//find the pivot index
        int start=0,end=length-1;
        int mid=0;
         boolean flag=false;
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        int search_element=sc.nextInt();
        for(int i=0;i<length-1;i++){
            if(arr[i]>arr[i+1]){
                pivot_index=i+1;
            }
        }
        if(search_element>arr[pivot_index]&&search_element<arr[end]){
            start=pivot_index;
        }else{
            end=pivot_index-1;
        }
        while(start<end){
             mid=(start+end)/2;
            if(arr[mid]==search_element){
                flag=true;
                break;
            }else if(arr[mid]>search_element){
                end--;
            }else{
                start++;
            }
        }
        if(flag){
            System.out.print(mid);
        }else{
            System.out.print("-1");
        }
	}

}

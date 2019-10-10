//sample ip- My name is Raj
//op-Raj is name My

import java.util.*;

class ReverseString {
	public static void main (String[] args) {
	    
	    String temp="";
	    
	    String str="My name is Raj";
	    String arr[]=str.split(" ");
	   // System.out.println(arr[0]);
	    int j=arr.length-1;
	    for(int i=0;i<(arr.length)/2;i++){
	        temp=arr[i];
	        arr[i]=arr[j];
	        arr[j]=temp;
	        j--;
	    }
	    temp="";
	    for(int i=0;i<arr.length;i++){
	        temp=temp+arr[i]+" ";
	    }
	    System.out.println(temp);
	}
}

//Link:https://codezen.codingninjas.in/practice/139982/4726/interview-shuriken-23:-modify-one-element
//Given an array of integers, 
//write a function to determine whether the array could become non-decreasing by modifying at most 1 element.

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
        int counter=0;
		for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<length-1;i++){
            if(arr[i]>arr[i+1]){
                counter++;
            }
        }
        if(counter==1){
            System.out.print(true);
        }else{
        	System.out.print(false);
        }
	}

}

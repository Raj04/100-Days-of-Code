//Link:https://codezen.codingninjas.in/practice/465/594/count-inversions
//Let A[0 ... n-1] be an array of n distinct positive integers. If i < j and A[i] > A[j] then the pair (i, j) is called an inversion of A (where i and j are indexes of A). Given an integer array A, your task is to find the number of inversions in A.
//As if now time limit exceeded as using O(n^2) 
//need optimisation


public class CountInversion {
	
	long solve(int[] A,int n){
	
        long counter=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]>A[j]){
                    counter++;
                }
            }
        }
		return counter;
	}
	
}


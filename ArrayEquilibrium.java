//Link: https://codezen.codingninjas.in/practice/465/31/array-equilibrium-index

public class ArrayEquilibrium{	
	//arr is the given array in which you need to find the equilibrium index
	public static int arrayEquilibrium(int[] arr){  
		//write your code here
        
        //we will maintain a sum whole array elements
        //another sum which will sums up the current array elements
       	int total_sum=0,current_sum=0;
        for(int i=0;i<arr.length;i++){
        	total_sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            total_sum-=arr[i];
            //we wouldn't sum the current index if its matched else
            //we will sum up to the current_sum
            if(total_sum==current_sum){
                return i;
            }
            current_sum+=arr[i];
        }
        return -1;
	}
}

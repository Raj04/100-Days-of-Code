//Link:https://codezen.codingninjas.in/practice/465/96/special-sum-of-array
//special sum of the array

public class SpecialSumArray {

	public static int sum(int arr[])
	{
        if(arr.length==1){
            return arr[0];
        }
        int actual_sum=0,sum=0,rem=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        while(true){   
	        while(sum!=0){
                actual_sum+=sum%10;
        		sum/=10;
        	}
        // 	System.out.println(actual_sum);
     		if(actual_sum<9){
                break;
            }
            sum=actual_sum;
            actual_sum=0;
        }	
        return actual_sum;
	}
}

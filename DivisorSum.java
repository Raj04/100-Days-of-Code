//Link:https://codezen.codingninjas.in/practice/464/608/divisor-sum

//Tried recursive approach also throwing stackoverflow due to many calls and mostly no compiler allocates so much of memory

import java.lang.Math.*;

public class DivisorSum {

	public static int divSum(int a) {
		
        int sum=0;
        for(int i=1;i<=(a/2);i++){
            if(a%i==0){
            	sum+=i;
            }
        }
        return sum;
//         return helper(a,1);
	}
//     using recursion it will throw stackoverflow since many calls will be there
//     public static int helper(int n,int x){
        
//         int sum=0;
//         if((n/2)==x){
//             return x;
//         }
//         if(n%x==0){
//             sum=x;
//         }
//         sum=sum+helper(n,x+1);
//         return sum;
//     }
}

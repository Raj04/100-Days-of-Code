//Link:https://codingninjas.in/app/practice/500/35/geometric-sum
//Finding the geometric sum

import java.lang.Math.*;

public class GeometricSum {

	public static double findGeometricSum(int k){
		// Write your code here
        if(k==0){
            return 1;
        }
        return (findGeometricSum(k-1)+(1/(Math.pow(2,k))));
	}
}

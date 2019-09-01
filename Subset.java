//Link:https://codezen.codingninjas.in/practice/470/2298/check-subset
//

import java.util.*;

public class Subset {
	
	public static boolean CheckSubset(int[] arr1, int n1, int[] arr2, int n2) {
		/*Your class should be named solution. 
		*Don't write main().
		*Don't take input, it is passed as function argument.
		*Don't print output.
		*Taking input and printing output is handled automatically.
		*/ 
//         if(n1==0 || n2==0){
//             return false;
//         }
        int counter=0;
//         boolean flag=false;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n1;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            if(set.contains(arr2[i])){
                counter++;
            }
        }
        if(counter==n2){
            return true;
        }
        return false;
	}

	
}

//Link: 

import java.util.*;

public class Pangram {

	public static void ans(int n, String str) {
	
        Map<Integer,Character> mp=new HashMap<>();
        str=str.toUpperCase();
        int counter=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){ 	  
	            if(mp.containsValue(str.charAt(i))){
    	            continue;
        	    }else{
            	    mp.put(i,str.charAt(i));
                	counter++;
            	}
            }
        }
        if(counter==26){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
	}
}

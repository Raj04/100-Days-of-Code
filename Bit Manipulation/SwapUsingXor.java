//Problem: Swap two variable using XOR


import java.util.*;

class SwapUsingXor {
	public static void main (String[] args) {
	
	    //swap using bit manipulation tricks
	    int x=8,y=7;
	    x=x^y;//finding the xor so all the bits will be set
	    y=x^y;//if xor is applied with y so it will yield x as all the bits will be set acc to y 
	            //
	    x=x^y;//having got the x as 7 if it applied xor with y so it will yield y so all the bits are set for x

	    System.out.println(x+" "+y);
	}
}

/*Step 1-
1000-->8
^
0111-->7
-------
1111-->15
-------

Step 2-
1111-->15
^
0111-->7
-------
1000-->8
-------

Step 3- 
1111-->15
^
1000-->8
-------
0111-->7
-------
*/

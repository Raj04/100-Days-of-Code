//Link:https://codezen.codingninjas.in/practice/467/724/amazing-strings

public class Solution {

	
	public static void answer(String s1,String s2,String s3)
	{
		int[] array1=new int[26];
        int[] array2=new int[26];
        int count=0;
        boolean flag=false;
        for(int i=0;i<s1.length();i++){
            array1[s1.charAt(i)-'A']++;
        }
        for(int i=0;i<s2.length();i++){
            array1[s2.charAt(i)-'A']++;
        }
        //creating the boolean 
        for(int i=0;i<s3.length();i++){
            array2[s3.charAt(i)-'A']++;
        }
        //matching the boolean array of both
        //if they are same then that says all the characters are present in 3rd
        for(int i=0;i<array1.length;i++){
            if(array1[i]==array2[i]){
                flag=true;
                continue;
            }else{
            	flag=false;
            	break;
            }
        }
        if(flag){
            System.out.print("YES");
            return;
        }
        System.out.print("NO");
	}
	

	
}

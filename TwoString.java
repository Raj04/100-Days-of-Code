//Link:https://codezen.codingninjas.in/practice/467/717/two-substrings


public class TwoString {

    /*
    	one of the best problem of strings. 
        Just check and make sure that the end of strings AB,BA is not the start or not
        overlapping each other. Keeping last_index to keep a track of AB,BA end of the string
        Lastly just check if x and y !=0 
        -->Last_index(we store end of the string) is used to check if the end of the string is not the start of other.
        Since we have to check for both.
    */
	
	public static void twoSubstrings(String str)
	{
        int last_index=-1;
        int x=0,y=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='A' && str.charAt(i+1)=='B' && last_index!=i){
                x++;
                last_index=i+1;
            }else if(str.charAt(i)=='B' && str.charAt(i+1)=='A' && last_index!=i){
                y++;
                last_index=i+1;
            }
        }
        if(x!=0 && y!=0){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
	}
}

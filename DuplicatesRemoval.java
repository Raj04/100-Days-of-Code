//Link:https://codezen.codingninjas.in/practice/467/91/remove-duplicates
public class DuplicatesRemoval {

	public static String removeConsecutiveDuplicates(String s) {

        if(s.length()==1){
            return s;
        }
        String prevStr=removeConsecutiveDuplicates(s.substring(1,s.length()));
        if(prevStr.charAt(0)==s.charAt(0)){
            return prevStr;
        }
        return s.charAt(0)+prevStr;
	}

}

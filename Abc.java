import java.util.*;

public class Abc {

	public static void main(String[] args) {

		int i,max=0,index=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sp[]=s.split("[^a-zA-z]+");
		for(i=0;i<sp.length;i++){
			if(sp[i].length()>max){
				index=i;
				max=sp[i].length();
			}
		}
		System.out.println("the word with length "+max+" is "+sp[index]);	
	}

}

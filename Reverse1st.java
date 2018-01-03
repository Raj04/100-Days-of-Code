import java.util.*;

public class Reverse1st {

	public static void main(String[] args) {
		
		int i,j;
		char temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		char []ch=s.toCharArray();
		int len=ch.length;
		for(i=0,j=len-1;(i<len/2);i++,j--){
			
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		String nst=new String(ch);
		System.out.println(nst);
	}

}

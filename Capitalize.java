import java.util.*;

public class Capitalize {

	public static void main(String[] args) {

		int i;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[]ch=s.toCharArray();
		for(i=0;i<ch.length;i++){
			if(i==0){
				ch[i]-=32;
			}
			if(ch[i]==' '){
				ch[i+1]-=32;
			}
		}
		String ns=new String(ch);
		System.out.println(ns);
	}

}

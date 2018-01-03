import java.util.*;

public class Capitalize {

	public static void main(String[] args) {

		int i,j;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char []ch=s.toCharArray();
		for(i=0;i<ch.length;i++){
			if(ch[i]>='A'&&ch[i]<='z')
			if(ch[i]+1=='a' || ch[i]+1=='e'||ch[i]+1=='i'||ch[i]+1=='o' ||ch[i]+1=='u'){
				ch[i]+=1;
				ch[i]-=32;
			}else{
				ch[i]+=1;
			}
			
		}
		String ns=new String(ch);
		System.out.println(ns);
	}

}

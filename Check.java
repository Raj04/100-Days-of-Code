import java.util.*;

public class Check {

	public static void main(String[] args) {
		
		int i=0,flag=0;
		String c="";
		String c1="";
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char []ch=s.toCharArray();
		for(i=0;i<ch.length;i++){
			c=c+ch[i];
			if(ch[i+1]=='&'){
				break;
			}
		}
		for(i=0;i<ch.length;i++){
			if(ch[i]=='='){
				flag=1;
				continue;
			}
			if(flag==1){
				c1=c1+ch[i];
			}
		}
		System.out.println(c+" "+c1);
		int a=Integer.parseInt(c);
		int b=Integer.parseInt(c1);
		//(a>b)? System.out.println("true a>b"):System.out.println("false a>b");
		if(a>b){
			System.out.println("a>b");
		}else{
			System.out.println("a<b");
		}
	}

}

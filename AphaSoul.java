import java.util.*;

public class AphaSoul {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[]ch=s.toCharArray();
		Arrays.sort(ch);
		String ns=new String(ch);
		System.out.println(ns);
	}

}

package 实验3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class test3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		StringTokenizer  st= new StringTokenizer(s);
		System.out.println(st.countTokens());
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		String s2=" wa     zhi wan  t  smal bro b     ";
		
		String [] sarry=s2.trim().split("\\s+");
		System.out.println(sarry.length);
		for(int i=0;i<sarry.length;i++) {
			System.out.println(sarry[i]);
		}
	}

}

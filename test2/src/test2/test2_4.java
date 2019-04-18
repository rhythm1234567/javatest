package test2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test2_4 {
	
public static boolean is_1(String number) {
	boolean flag=false;
	String regex="\\(\\d{4}\\)\\d{4}\\-\\d{4}";
	flag=number.matches(regex);
return flag;
}

public static void is_2(String s) {
	
	String regex="(\\d{1,3}\\.){3}\\d{1,3}";
	Pattern r=Pattern.compile(regex);
	Matcher m=r.matcher(s);
	
	while(m.find()) {
		String e=m.group(0);
		System.out.println(e);
	}
	
}
public static String is_3(String s) {
	s=s.replaceAll("(.)\\1+","$1");
	return s;
}
public static String is_4(String s) {
	s=s.replaceAll("(abc)\\1+","abc");
	return s;
}
public static boolean is_6(String s) {
	boolean flag=false;
	String regex=".*abc{1}$";
	flag=s.matches(regex);
	return flag;
	
}

public static int [] is_8(String s) {
	int x[]=new int[10];
	int i=0;
	String regex="\\d+";
	Pattern r=Pattern.compile(regex);
	Matcher m=r.matcher(s);
	
	while(m.find()) {
		String e=m.group(0);
		x[i]=Integer.parseInt(e);
		i++;
	}
	return x;
}
public static void is_10(String s) {
	
	String regex="%CXLL=.*?(?=%)";
	Pattern r=Pattern.compile(regex);
	Matcher m=r.matcher(s);
	
	while(m.find()) {
		String e=m.group(0);
		System.out.println(e);
	}
	
}
	public static void main(String[] args) {

		System.out.println("(1)"+is_1("(0000)0000-0000"));
		System.out.print("(2)");is_2("xxx001.021.211.22x2.2.2.2xxxxxx11.2.333.4.5");
		System.out.println("(3)"+is_3("aaabbbcccd"));
		System.out.println("(4)"+is_4("abcabbcabcabc"));
		System.out.println("(6)"+is_6("abc"));
		int x[]=is_8("1zz25xx11c60xx0xx06x07");
		System.out.print("(8)");
		for(int i=0;i<x.length;i++)
		System.out.print(x[i]);
		System.out.print("\n(10)");
		is_10("%CXLL=123456%CXLL=1%CXLL%CXLL=123%");
		
	}


}

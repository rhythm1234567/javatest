package test2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test2_4 {
	
public static boolean is_1(String number) {
	boolean flag=false;
	String regex="\\(\\d{4}\\)\\d{4}\\-\\d{4}";
	flag=number.matches(regex);
	return flag;
}

public static boolean is_6(String s) {
	boolean flag=false;
	String regex=".*abc{1}$";
	flag=s.matches(regex);
	return flag;
	
}

	public static void main(String[] args) {

		System.out.println("(1)"+is_1("(0000)0000-0000"));
		System.out.println("(6)"+is_6("abc"));
	}


}

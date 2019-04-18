package test2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="this is a test of java";
int count=(s.split("s")).length;
System.out.println("(1)"+(count-1));

String sub=s.substring(s.indexOf("test"),s.indexOf("test")+"test".length());
System.out.println("(2)"+sub);

char[] str=s.toCharArray();



Pattern p=Pattern.compile("\\b[a-z]");
Matcher m=p.matcher(s);
StringBuffer buf=new StringBuffer();
while(m.find()) {
	m.appendReplacement(buf,m.group().toUpperCase());
}
m.appendTail(buf);
System.out.println("(4)"+buf);


StringBuffer b=new StringBuffer(s);
b.reverse();
String s2=b.toString();
System.out.println("(5)"+s2);
for(int i=str.length-1;i>=0;i--)
	System.out.print(str[i]);
	
System.out.println();
	String s3="this is a test of java";	
String []s4=s3.split(" ");
for(int i=0;i<s4.length;i++)
System.out.print(s4[i]+"  ");
	}
}

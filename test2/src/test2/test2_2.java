package test2;

public class test2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	StringBuffer buffer=new StringBuffer("abc");
	String str=buffer.toString();
	StringBuffer buffer2=new StringBuffer(str);
	buffer2.insert(2, "1");
	System.out.println(buffer2);
	buffer2.append("2");
	System.out.println(buffer2);
	buffer2.delete(0, 2);
	System.out.println(buffer2);
	buffer2.deleteCharAt(1);
	System.out.println(buffer2);
	buffer2.reverse();
	System.out.println(buffer2);
}
}

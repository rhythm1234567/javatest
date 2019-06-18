package test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

class student implements Comparable<Object>{
	int sno;
	String name;
	float score=0;
	public student(int sno, String name, float score) {
		super();
		this.sno = sno;
		this.name = name;
		this.score = score;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		student stu=(student)o;
		
			return sno>stu.sno?1:-1;
	
	}
	@Override
	public String toString() {
		return "student [sno=" + sno + ", name=" + name + ", score=" + score + "]";
	}

}
class compares implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		return o1.score>o2.score?1:-1;

	}
	
}
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student(1,"xx", 10);
		student s3=new student(3,"vv", 1);
		student s2= new student(2, "zz", 10);
		ArrayList<student> array=new ArrayList<>();
		array.add(s1);
		array.add(s2);
		array.add(s3);
		compares c=new compares();
		array.sort(c);
	Iterator<student>it=array.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	ArrayList<student> array2=new ArrayList<>();
	array2.add(s1);
	array2.add(s2);
	array2.add(s3);
	for(student s:array2) {
		System.out.println(s);
	}
	
	}
	

}

package test4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable{
	int id;
	String name;
	float score;
	public Student(int id, String name, float score) {
		
		this.id = id;
		this.name = name;
		this.score = score;
	}
	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		int result=0;
		result=s.score>score?-1:(s.score==score?0:1);
		if(result==0) {
			return s.name.compareTo(name);
		}
			return result;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	
}
public class TreesetDemo {

	public static void main(String[] args) {
		Student s1=new Student(1,"zz",12);
		Student s2=new Student(2,"xx",10);
		Student s3=new Student(3,"ww",10);
		Set<Student> set=new TreeSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		Iterator<Student>it=set.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s);
		}
		
	}

}

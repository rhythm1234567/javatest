package test4;

import java.util.HashSet;
class x{
	String name;
	int age;
	public x(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
	
		stu other = (stu) obj;
		if (age != other.age)
			return false;
		
	  if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}
}

class y{
	String name;
	int age;
	public y(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}
}
public class hashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<stu>s=new HashSet<>();
		stu s1=new stu("zz",1);
		stu s2=new stu("zz",1);
		s.add(s1);
		s.add(s2);
		System.out.println("重写hashcode和equals函数：");
		for(stu si:s) {
			System.out.println(si);
		}
		System.out.println("无重写hashcode和equals函数：");
		y s3=new y("zz", 1);
		y s4= new y("zz", 1);
		HashSet<y> set=new HashSet<>();
		set.add(s3);
		set.add(s4);
		for(y sx:set) {
			System.out.println(sx);
		}
	}


}

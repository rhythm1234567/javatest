package test4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class stu{
	String name;
	int age;
	public stu(String name, int age) {
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
public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stu s1= new stu("小方", 1);
		stu s2= new stu("小方", 1);
		stu s3=new stu("小圆",2);
		Map<stu, String> map=new HashMap<stu, String>();
		map.put(s1, "幼儿园1");
		map.put(s2, "幼儿园2");
		map.put(s3, "幼儿园3");
		Set set=map.keySet();
		Iterator it =set.iterator();
		while(it.hasNext()) {
			stu s=(stu)it.next();
			System.out.println(s+"地址:"+map.get(s));
		}
		
		Set<Entry<stu, String>> set2=map.entrySet();
		Iterator<Entry<stu, String>> i=set2.iterator();
		
		while(i.hasNext()) {
			Map.Entry<stu, String> s=i.next();
			System.out.println(s.getKey()+" "+s.getValue());
		}
	}

}

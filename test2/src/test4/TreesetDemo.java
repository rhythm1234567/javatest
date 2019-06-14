package test4;

class Student implements Comparable{
	int id;
	String name;
	float score;
	public Student(int id, String name, float score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		int result=0;
		if(s.score==this.score) {
			result=s.name.compareTo(this.name);
			
		}
		else {
			result=s.score>this.score?1:0;
		}
		return 0;
	}
	
}
public class TreesetDemo {

	public static void main(String[] args) {
		

	}

}

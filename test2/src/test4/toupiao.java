package test4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


class hou{
	String name;
	int num=0;
	public hou(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "hou [name=" + name + ", num=" + num + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return false;
		hou other = (hou) obj;
		if (!name.equals(other.name))
			return true;
		return true;
	}
	
}

public class toupiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hous=new HashMap<>();
		hou hou1=new hou("1");
		hou hou2=new hou("2");
		hou hou3=new hou("3");
		hous.put(hou1.name,hou1.num);
		hous.put(hou2.name,hou2.num);
		hous.put(hou3.name,hou3.num);
		for(int i=0;i<3;i++)
		{Scanner s=new Scanner(System.in);
		
			String sname=s.next();
			
			if(hous.containsKey(sname))
			{
				hous.put(sname,hous.get(sname)+1);
			}
			
		}
		Set<Entry<String, Integer>> set=hous.entrySet();
		for(Entry<String, Integer> i :set) {
			System.out.println(i);
		}
	}

}

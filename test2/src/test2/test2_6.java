package test2;

import java.util.*;

public class test2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int l[]=new int[100];
Random r=new Random();
for(int i=0;i<l.length;i++)
{
	l[i]=r.nextInt(99);
}
int[] copy=Arrays.copyOf(l,l.length);
Arrays.sort(copy);
System.out.println(Arrays.toString(copy));
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int index=Arrays.binarySearch(copy, x);
System.out.println("位置是"+index);
	}

}

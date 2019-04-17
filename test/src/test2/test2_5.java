package test2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.*;
import java.util.*;



public class test2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一个yyyy-MM-dd（年月日）格式的日期字符串:");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Date date =new Date();
SimpleDateFormat t1=new  SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
SimpleDateFormat t2=new  SimpleDateFormat("Gyy-MM-FF HH:mm:ss");
System.out.println(t1.format(date));
System.out.println(t2.format(date));

	}

}

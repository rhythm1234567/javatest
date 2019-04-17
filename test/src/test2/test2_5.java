package test2;

import java.time.*;
import java.util.Scanner;


public class test2_5 {

	public static void main(String[] args) {
		System.out.println("输入一个yyyy-MM-dd（年月日）格式的日期字符串:");
		Scanner s=new Scanner(System.in);
		LocalDate time=LocalDate.parse(s.nextLine());
		time=time.plusDays(7);
		System.out.println(time);
		LocalDate today=LocalDate.now();
		System.out.println(today);
	}


}

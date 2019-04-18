package test2;

import java.time.*;
import java.time.format.*;
import java.util.Scanner;


public class test2_5 {

	public static void main(String[] args) {
		DateTimeFormatter[] format=new DateTimeFormatter[] {
			DateTimeFormatter.ISO_LOCAL_DATE,
			DateTimeFormatter.ISO_LOCAL_TIME,
				DateTimeFormatter.ofPattern("HH:mm:ss")	
		};
		System.out.println("输入一个yyyy-MM-dd（年月日）格式的日期字符串:");
		Scanner s=new Scanner(System.in);
		LocalDate time=LocalDate.parse(s.nextLine());
		time=time.plusDays(7);
		System.out.println(time.format(format[0]));
		LocalTime today=LocalTime.now();
		for(int i=1;i<format.length;i++)
		System.out.println(today.format(format[i]));
		
		LocalDateTime t=LocalDateTime.now();
		t=t.plusYears(1);
		t=t.plusDays(6);
		t=t.plusMonths(1);
		t=t.plusHours(5);
		System.out.println(t);
	}


}

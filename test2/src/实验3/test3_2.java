package 实验3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd E");
		Calendar d=Calendar.getInstance();
		d.add(Calendar.DATE, -50);
		int day=d.get(Calendar.DATE);
		int week=d.get(Calendar.DAY_OF_WEEK);
		System.out.println(f.format(d.getTime()));
	}

}

package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 输出三个月前时间 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		calendar.add(Calendar.MONTH, -3);
		Date time = calendar.getTime();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		System.out.println(simpleDateFormat.format(time));
	}

}

package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 时间差 {
	    
	
	public static void main(String[] args) {
		
		Thread th1 = new Thread();
		while(true) {
			try {
				//long startTime = fromDateStringToLong(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS").format(new Date()));
				long startTime = System.currentTimeMillis();
				th1.sleep(500);
				long stopTime = System.currentTimeMillis();
				//long stopTime = fromDateStringToLong(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS").format(new Date()));
				System.out.println(stopTime-startTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static long fromDateStringToLong(String inVal) {
		Date date = null;
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
		try {
		date = inputFormat.parse(inVal);
		}catch(Exception e){
		e.printStackTrace();
		}
		return date.getTime();
	}


		
}
	
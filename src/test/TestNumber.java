package test;

import java.util.ArrayList;
import java.util.List;

public class TestNumber {
	
	/**
	 * 设计一个集合，这个集合里即可以放整数，也可以放浮点数，但是不能放字符串 
	 * @param args
	 */
	public static void main(String[] args) {
		List<Number> arr = new ArrayList<>();
		arr.add(1);
		arr.add(1.1);
		//arr.add("dd");
		Integer a = new Integer(100);
		Integer b = 100;
		System.out.println(a == b);
		int i = 1;

	}

}
 
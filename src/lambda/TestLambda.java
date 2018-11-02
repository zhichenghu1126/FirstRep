package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.net.SyslogAppender;

public class TestLambda {

	public static void main(String[] args) {
		//lambda排序
		//sortArray();
		//lambda循环
		circle();
		
		
		
		
	}

	private static void circle() {
		String[] str = {"aa","bb","cc","dd"};
		List<String> list = Arrays.asList(str);
		//1.第一种循环方式
		/*for (String string : list) {
			string+="aa";
			System.out.println(string);
		}*/
		//2.第二种方式
		/*list.forEach((ss)->{
			ss = ss+"a";
			System.out.println(ss);});*/
		
		//3.第三种方式
		//list.forEach(System.out::println);
		
		
	}

	private static void sortArray() {
		List<String> list = new ArrayList<String>();
		list.add("b");
		list.add("a");
		list.add("c");
		list.add("r");
		list.add("d");
		list.add("a");
		Collections.sort(list,(str1,str2)->str1.compareTo(str2));
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}

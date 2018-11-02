package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {
		
		/*String[] str = {"aa","bb","cc","dd","dd"};
		List<String> list = Arrays.asList(str);*/
//		直接将String数组转为流
//		Stream<String> stream = Arrays.stream(str);
		//去重distinct
		/**list.stream().distinct().collect(toList()).forEach(System.out::println);*/
		//截取limit
		/**list.stream().limit(3).collect(toList()).forEach(System.out::println);*/
		//跳过前n个元素
		/**list.stream().skip(3).collect(toList()).forEach(System.out::println);*/
		//合并多个流
		List<String> list = new ArrayList<String>();
		list.add("I am a boy");
		list.add("I love the girl");
		list.add("But the girl loves another girl");
		list.stream()
        .map(line->line.split(" "))
        .flatMap(Arrays::stream)
        .distinct()
        .collect(toList()).forEach(System.out::println);

		
	}

}



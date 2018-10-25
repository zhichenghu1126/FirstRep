package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("001", "a");
		map.put("002", "b");
		map.put("003", "c");
		map.put("004", "d");
		map.put("005", "e");
		printMap(map);
	}
	/**
	 * 遍历打印map
	 * @param map
	 */
	public static void printMap(Map<String,String> map) {
		//Set<Entry<String, String>> entrySet = map.entrySet();
		//方法一：通过键值对对象entrySet获取键与值
		for(Entry<String,String> entry : map.entrySet()) {
			System.out.println("key="+entry.getKey()+"value="+entry.getValue());
		}
		
		//Set<String> keySet = map.keySet();
		//方法二：通过键keySet获取值
		for(String key : map.keySet()) {
			//map的get方法
			//Returns the value to which the specified key is mapped, 
			//or null if this map contains no mapping for the key. 
			String value = map.get(key);
			System.out.println("key="+key+"value="+value);
		}
		
		//values方法：Returns a Collection view of the values contained in this map
		Collection<String> values = map.values();
		System.out.println(values);
		//判断是否存在键和值
		System.out.println(map.containsKey("001"));
		System.out.println(map.containsValue("z"));
		//将key为 "003" 的value 换为  "z"
		String replace = map.replace("003", "z");
        System.out.println("replace="+replace);
        System.out.println(map);
	}
	
   public static <K,V> Map printList(Map map) {
     
        System.out.println("------------------------");
        return map;
    }
}

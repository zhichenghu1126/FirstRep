package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMap {

	public static void main(String[] args) {
		
	}

    public static HashMap<Integer, Person> SortedHashMap(
            HashMap<Integer, Person> map) {
        // 获得键值对Set集合
        Set<Entry<Integer, Person>> entrySet = map.entrySet();
        // 将键值对Set集合转化为List以用Collections来排序
        List<Entry<Integer, Person>> list = new ArrayList<Map.Entry<Integer, Person>>(
                entrySet);
        // 通过Collections来排序，添加比较器，比较年龄
        Collections.sort(list, new Comparator<Entry<Integer, Person>>() {
            @Override
            public int compare(Entry<Integer, Person> o1, Entry<Integer, Person> o2) {
                int result = o2.getValue().age - o1.getValue().age;
                result = result == 0 ? o2.hashCode() - o1.hashCode() : result;
                return result;
            }
        });

        // 创建LinkedHashMap来存储排好序的List元素
        LinkedHashMap<Integer, Person> linkedHashMap = new LinkedHashMap<Integer, Person>();
        // 遍历List，将元素添加到linkedHashMap中
        for (Entry<Integer, Person> entry : list) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }

        return linkedHashMap;
    }
}


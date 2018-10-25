package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class TestList {

@Test
	public  void test() {
		// TODO Auto-generated method stub

	    
/*	    List<String> str = new ArrayList<>();
	    String e = "e";
	    str.add("11");
	    str.add("22");
	    for (String string : str) {
	    	string = string +"3";
	    	str.add(e);
			System.out.println(string);
		}*/
	    
/*	    Set<String> set = new HashSet<>();
	    set.add("1");
	    set.add("2");
	    System.out.println(set.size());
	    for(String str1 :set) {
	    	System.out.println(str1);
	    	set.add("3");
	    }*/
	    
/*	    Set<String> set = new TreeSet<>();       
        set.add("1f");  
        set.add("a");  
        set.add("b");  
        set.add("c");  
        set.add("d");  
        set.add("e");          
        System.out.println(set);*/
	    
		Map<String, String> map = new HashMap<>();
	    map.put("1", "value1");
	    map.put("2", "value2");
	    map.put("3", "value3");
	    System.out.println("git test");
	    for (Map.Entry<String, String> entry : map.entrySet()) {
	        System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	    }
	}

}

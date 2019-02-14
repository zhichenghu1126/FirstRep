package test;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.alibaba.fastjson.JSON;

public class TestJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero 盖伦 = new Hero();
		盖伦.setAdr("德玛西亚");
		盖伦.setName("盖伦");
		Hero 提莫 = new Hero();
		提莫.setAdr("班德尔城");
		提莫.setName("提莫");
		List<Hero> hero = new ArrayList<>();
		hero.add(盖伦);
		hero.add(提莫);
		//System.out.println(buildJSONResponse());
	}
	
    private static JSONObject buildJSONResponse() {
        JSONObject json = new JSONObject();
        Hero hero = new Hero();
        hero.setAdr("天润公馆");
        hero.setName("小强");
        json.put("地址", hero.getAdr());
        json.put("姓名", hero.getName());
        
        return json;
    }
}

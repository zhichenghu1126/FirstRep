package test;

import java.util.HashMap;
import java.util.Map;

public class RomanAndInt {

	/**
	 * 罗马数字与阿拉伯数字相互转换
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(intToRoman(99));
		String str = intToRoman(3256);
		System.out.println(romanToInt(str));
	}
	
	public static String intToRoman(int num) { 
		
		String[][] RomanDict = new String[][] { 
			{ "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" }, 
			{ "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" }, 
			{ "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" }, 
			{ "", "M", "MM", "MMM", "", "", "", "", "", ""}
		};
		
		return RomanDict[3][num / 1000] + 
			   RomanDict[2][num % 1000 / 100] + 
			   RomanDict[1][num % 100 / 10] + 
			   RomanDict[0][num % 10]; 
	}
	
	public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0, i = 0, temp;
        for (i = 0; i < s.length() - 1; i++) {
            temp = map.get(s.charAt(i));
            if (temp < map.get(s.charAt(i+1))) {
                result -= temp;
            } else {
                result += temp;
            }
        }
        result += map.get(s.charAt(i));
        return result;
	}
}

package test;

/**
 * 字符串反转(递归法)
 * @author Pactera
 *
 */

public class ReverseStr {

	public static void main(String[] args) {
		String str = "a bc de fg";
		//System.out.println(reverseStr(str));
		System.out.println(countCharacter(str));
	}
	
	/**
	 * 字符串反转(递归法)
	 * @param str
	 * @return
	 */
	private static String reverseStr(String str) {
		if(str.length()<=1) {
			return str;
		}
		return reverseStr(str.substring(1))+str.charAt(0);
	}
	
	/**
	 * 统计空格有多少
	 * @param str
	 * @return
	 */
	public static int countCharacter(String str) {
		int i;
		int count = 0;
		for(i=0; i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
	
	
	
	
}

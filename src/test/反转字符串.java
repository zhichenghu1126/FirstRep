package test;



public class 反转字符串 {

		public static void main(String[] args) {
			String str="abcdefg";
			System.out.println(fun(str));
		}

		private static String fun(String str) {
			if(str==null||str.length()<2) {
				return str;
			}
			return fun(str.substring(1))+str.charAt(0);
			
			
			
			
		}

		
}
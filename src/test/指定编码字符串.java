package test;

public class 指定编码字符串 {

	public static void main(String[] args) {
		String string = translate("");
		System.out.println(string);
	}

	public static String translate(String str){//对传入的str字符串进行转换

		String tempStr = "";

		try{
			byte[] bytes = str.getBytes("ISO-8859-1");
		    tempStr = new String(bytes, "GBK");//把"ISO-8859-1"转化为“GBK”编码

		tempStr = tempStr.trim();

		}catch (Exception e){

		System.err.println(e.getMessage());

		}

		return tempStr;

		}
		
}

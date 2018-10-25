package test;

public class TestGenerics {

	public static <T> void printArray(T t[]) {
		for(T a:t) {
			System.out.println(a);
		}
		
	}
	public static void main(String[] args) {
		Integer [] integerArray = {1,2,3,4,5,6,7};
		Double [] doubleArray = {1.0,2.2,3.3,4.5,6.66,0.1};
		Character [] charArray = {'a','b','c','d','e','f','g'};
		printArray(integerArray);
		printArray(doubleArray);
		printArray(charArray);
		
	}



}

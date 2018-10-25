package test;

public class ADHero extends Hero {

	public static void main(String[] args) {
		String a = "1234a";
		String b = "1234" + "a";
		final String e = "1234";
		String c = "1234";
		String d = c +"a";
		String f = e +"a";
		System.out.println(a==b);
		System.out.println(a==d);
		System.out.println(a==f);
		new ADHero();
	}
	

	
	ADHero (){
		ADHero a1 = this;
		ADHero a2 = this;
		synchronized (a1) {
			try {
				a2.wait();
				System.out.println("hello");
			} catch (InterruptedException e) {
				System.out.println("good bye");
			} catch (Exception e) {
				System.out.println("method wrong");
			} finally {
				System.out.println("finally");
			}
			System.out.println("together");
		}
	}
	
	public int fun(int i)  throws MyException{
		return i;
	}
	
	public void fun() {
		
	}
	

	
	public int fun(int i,int j) {
		return i+j;
	}
}

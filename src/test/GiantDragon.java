package test;

public class GiantDragon {
	
	final String a = "aaa";
	static class inner{
		final String a = "bbb";
	}
	
	private GiantDragon() {
		
	}
	//懒汉式
	public static GiantDragon instance;
	//饿汉式
//	public static GiantDragon instance = new GiantDragon();
	public static GiantDragon getInstance() {
		if(instance==null) {
			instance = new GiantDragon();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.Name("xxx");	
		
		GiantDragon gd = new GiantDragon();
		System.out.println(gd.a);
		
		inner in = new inner();
		System.out.println(in.a);
		final String b = "bbb";
		
	}
	
	

}

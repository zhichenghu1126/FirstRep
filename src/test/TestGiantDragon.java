package test;

public class TestGiantDragon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiantDragon a = GiantDragon.getInstance();
		GiantDragon b = GiantDragon.getInstance();
		System.out.println(a==b);
	}

}

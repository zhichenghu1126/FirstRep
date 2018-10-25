package test;

import java.io.Serializable;

public class Hero implements Serializable{
    private static final long serialVersionUID = 1L;
	private String name,adr;
	protected float hp;
	public final String str="hzc";
	public static void main(String[] args) {
		Hero h = new Hero();
		ADHero ad = new ADHero();
		h = ad;
		ad = (ADHero) h;
		System.out.println(h instanceof ADHero);
		
		
		
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAdr() {
		return adr;
	}



	public void setAdr(String adr) {
		this.adr = adr;
	}

	
	Hero(){
				
	}
	

	
	Hero(String a){
		
	}
	
	void Name(final String a) {
		
	}
	
	public int fun(int i,int j) {
		return i+j;
	}
}

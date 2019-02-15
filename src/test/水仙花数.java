package test;

public class 水仙花数 {

	public static void main(String[] args) {
		print();
	}

	private static void print() {
		int a=0,b=0,c=0,num=0;
		for(int i=100;i<1000;i++) {
			a=i/100;
			b=(i%100)/10;
			c=i%10;
			if(a*a*a+b*b*b+c*c*c==i) {
				System.out.println(i+",");
				num++;
			}
		}
		System.out.println(num);
	}

}

package test;

public class 不重复3位数 {

	public static void main(String[] args) {
		fun();
		

	}

	private static void fun() {
		int i,j,k,count=0;
		for(i=1;i<5;i++) {
			for(j=1;j<5;j++) {
				for(k=1;k<5;k++) {
					if(i!=j&&j!=k&&i!=k) {
						count++;
						System.out.println(""+i+j+k);
					}
				}
			}
		}
		System.out.println(count);
	}
	
}

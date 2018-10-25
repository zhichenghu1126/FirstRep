package test;

import java.util.Scanner;

public class 分解质因数 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入你要分解的数：");
		int num = sc.nextInt();
		fun(num);
	}
	 
	private static void fun(int num) {
		int i;
		for(i=2;i<num+1;i++) {
			while(num%i==0&&num!=i) {
				num = num/i;
				System.out.print(i+" ");
			}
			if(num==i) {
				System.out.println(num);
			}
		}
		
	}

}

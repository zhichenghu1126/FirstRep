package test;

import java.util.Scanner;

public class 判断素数 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int num = 0;
		for(i=1;i<1000;i++) {
			if(fun(i)) {
				num++;
				System.out.print(i+" ");
				if(num%10==0) {
					System.out.println();
				}
			}
		}
		System.out.println(num);
	}

	private static boolean fun(int num) {
		int i ;
		if(num==1) {
			return false;
		}
		for(i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	
}



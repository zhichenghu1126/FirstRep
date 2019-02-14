package test;

import java.util.Arrays;
import java.util.Scanner;

public class 打印回型数和螺旋形数 {

		public static void main(String[] args)  {
			
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			fun_1(n);
//			fun_2(n);
		}



		private static void fun_1(int n) {
			int[][] map =new int[n*2-1][n*2-1];
			for (int i = 0; i < map.length; i++) { 
				for (int j = 0; j < map.length; j++) { 
					int d1 = Math.abs(i - n + 1); 
					int d2 = Math.abs(j - n + 1); 
					map[i][j] = 1 + (d1 > d2 ? d1 : d2);
					} 
				} 
			for (int[] ints : map) { 
				System.out.println(Arrays.toString(ints).replaceAll("\\[|\\]|,", "")); 
			}
			
			
		}

		private static void fun_2(int n) {
				final int U = 0, D = 1, L = 2, R = 3; 
				int[][] map = new int[n][n]; 
				int x = 0, y = 0, dir = R; 
				for (int i = 1; i <= n * n; i++) { 
					map[x][y] = i; switch (dir) { 
					case U: 
						if (x - 1 < 0 || map[x - 1][y] != 0) { 
							dir = R; 
							y++;
						} 
						else { 
							x--; 
						} 
						break;
					case D: 
						if (x + 1 > n - 1 || map[x + 1][y] != 0) {
							dir = L;
							y--; 
						} 
						else { 
							x++; 
						} 
						break; 
					case L: 
						if (y - 1 < 0 || map[x][y - 1] != 0) { 
							dir = U; x--; 
						} 
						else {
							y--; 
						} 
						break; 
					case R: 
						if (y + 1 > n - 1 || map[x][y + 1] != 0) { 
							dir = D; 
							x++; 
						} 
						else {
							y++; 
						} 
						break; 
					} 
				} 
				for (int i = 0; i < map.length; i++) { 
					for (int j = 0; j < map[i].length; j++) { 
						System.out.print(String.format("%2d ", map[i][j])); } System.out.println(); } }
		}
		
		
		

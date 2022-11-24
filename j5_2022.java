/*
	My official answer to the J5 questions. 
	The algorithm can only recieve 8/15 points due to the fact that it attemps to find the answer through brute force. 
	-Mohammad Pasha Khoshkebari
*/

package Actual;
import java.util.*;

public class j5 {
	private static int[][] map;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //or br
		
		int n = in.nextInt();
		
		map = new int[n][n];
		
		int trees = in.nextInt();
		
		for (int a = 0; a < trees; a++) {
			int y = in.nextInt() - 1;
			int x = in.nextInt() - 1;
			
			map[y][x] = 1;
		}
		
		for (int a = n-1; a >= 1; a--) {
			for (int b = 0; (b+a) < n; b++) {
				for (int c = 0; (c+a) < n; c++) {
					if (isTree(a, b, c)) {
						System.out.println(a+1);
						return;
					}
				}
			}
		}
		
		System.out.println(1);
	}
	
	public static boolean isTree(int size, int y, int x) {
		for (int a = y; a <= (y+size); a++) {
			for (int b = x; b <= (x+size); b++) {
				if (map[a][b] == 1) return false;
			}
		}
		
		return true;
	}

}









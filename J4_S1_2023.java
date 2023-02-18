package OFFICIAL_2023;
import java.util.Scanner;

public class J4_S1_2023 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] row1 = new int[n];
		int[] row2 = new int[n];
		
		int total = 0; 
		
		for (int a = 0; a < n; a++) {
			row1[a] = in.nextInt();
			if (row1[a] == 1) {
				total += 3;
			}
		}
		
		for (int a = 0; a < n; a++) {
			row2[a] = in.nextInt();
			if (row2[a] == 1) {
				total += 3;
			}
		}
		
		for (int a = 0; a < n-1; a++) {
			if (row1[a] == 1 && row2[a+1] == 1) {
				total -= 2;
			}
			if (row2[a] == 1 && row2[a+1] == 1) {
				total -= 2;
			}
		}
		
		
		for (int a = 0; a < n; a+= 2) {
			if (row1[a] == 1 && row2[a] == 1) {
				total -= 2;
			}
		}
		
		System.out.println(total);
	}

}











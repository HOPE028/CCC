package Actual;
import java.util.*;

public class J2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int counter = 0;
		
		int n = in.nextInt();
		
		for (int a = 0; a < n; a++) {
			int points = in.nextInt();
			int fouls = in.nextInt();
			
			points *= 5;
			fouls *= 3;
			
			if ((points - fouls) > 40) counter++;
		}
		
		System.out.print(counter);
		if (counter == n) System.out.print("+");
		
	}
}

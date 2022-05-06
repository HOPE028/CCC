package Actual;
import java.util.*;

public class J1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int big, small;
		
		big = in.nextInt();
		small = in.nextInt();
		
		big *= 8;
		small *= 3;
		
		int resault = big + small;
		
		System.out.println((resault - 28));
		
		
	}
}

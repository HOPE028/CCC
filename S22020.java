package Contest;
import java.util.*;
import java.util.HashSet;
import java.io.*;

public class S22020 {
	private static HashSet<String> visited = new HashSet<String>();
	private static String TARGET;
	private static int[][] map;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		map = new int[n][m];
		
		for (int a = 0; a < m; a++) {
			String[] temp = br.readLine().split(" ");
			
			for (int b = 0; b < n; b++) {
				map[b][a] = Integer.parseInt(temp[b]);
			}
		}
		
		
		TARGET = Integer.toString(n-1) + "," + Integer.toString(m-1);
		
		
		System.out.println(dfs(0,0) ? "yes" : "no");
		
		

	}
	
	public static boolean dfs(int x, int y) {
		
		String key = Integer.toString(x) + "," + Integer.toString(y);
		
		if (visited.contains(key)) return false;
		else visited.add(key);
		
		if (key.equals(TARGET)) return true;
		
		int currentValue = map[x][y];
		
		
		for (int a = 1; a <= currentValue; a++) {
			if (currentValue % a == 0) {
				int secondValue = currentValue / a;
				
				if (a-1 < map.length && secondValue-1 < map[0].length ) {
					if (dfs(a-1, secondValue-1)) {
						return true;
					}
				}
				
			}
		}
		
		return false; 
	}

}

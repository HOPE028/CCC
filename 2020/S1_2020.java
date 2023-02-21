package Contest;
import java.util.*;

public class S12020 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int n = in.nextInt();
		
		int[] listOfTimes = new int[n];
		
		
		for (int a = 0; a < n; a++) {
			int tempTime = in.nextInt();
			int tempDistance = in.nextInt();
			
			listOfTimes[a] = tempTime;
			map.put(tempTime, tempDistance);
		}
		
		Arrays.sort(listOfTimes);
		
		int currentNumber = 0; 
		int lastNumber = 0; 
		int currentTime = 0;
		int lastTime = 0; 
		
		double x = 0; 
		
		
		for (int a = 0; a < n; a++) {
			if (a == 0) {
				lastTime = listOfTimes[a];
				lastNumber = map.get(listOfTimes[a]);
			} else {
				currentTime = listOfTimes[a];
				currentNumber = map.get(listOfTimes[a]);
				
				double time = currentTime - lastTime;
				double distance = currentNumber - lastNumber;
				
				if (distance < 0) {
					distance *= -1;
				}
				
				System.out.println(distance);
				
				double tempX = distance/time; 
						
				if (tempX > x) x = tempX;
						
				lastTime = currentTime;
				lastNumber = currentNumber;
			}
		}
		
		System.out.println(x);
		

	}

}













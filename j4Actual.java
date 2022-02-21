/*
 * Hello! Here is my answer to the J5 / S2 questions on the 2022 CCC.
 * 
 * This passed with 15/15 on the CCC grader.
 * 
 * -Mohammad Pasha Khoshkebari
 */


package Actual; //Remove Package
import java.util.*;

public class j4Actual {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap <String, ArrayList<String>> friends = new HashMap<String, ArrayList<String>>();
		HashMap <String, ArrayList<String>> enemies = new HashMap<String, ArrayList<String>>();
		
		int x = in.nextInt(); //friends
		
		for (int a = 0; a < x; a++) {
			String temp1 = in.next();
			String temp2 = in.next();
			
			if (friends.containsKey(temp1)) {
				friends.get(temp1).add(temp2);
			} else {
				ArrayList<String> tempArrayList = new ArrayList<String>();
				tempArrayList.add(temp2);
				friends.put(temp1, tempArrayList);
			}
			
			if (friends.containsKey(temp2)) {
				friends.get(temp2).add(temp1);
			} else {
				ArrayList<String> tempArrayList = new ArrayList<String>();
				tempArrayList.add(temp1);
				friends.put(temp2, tempArrayList);
			}
		}
		
		int y = in.nextInt(); //enemies
		
		for (int a = 0; a < y; a++) {
			String temp1 = in.next();
			String temp2 = in.next();
			
			if (enemies.containsKey(temp1)) {
				enemies.get(temp1).add(temp2);
			} else {
				ArrayList<String> tempArrayList = new ArrayList<String>();
				tempArrayList.add(temp2);
				enemies.put(temp1, tempArrayList);
			}
			
			if (enemies.containsKey(temp2)) {
				enemies.get(temp2).add(temp1);
			} else {
				ArrayList<String> tempArrayList = new ArrayList<String>();
				tempArrayList.add(temp1);
				enemies.put(temp2, tempArrayList);
			}
		}
		
		int g = in.nextInt();
		int counter = 0; //constraints broken
		
		for (int a = 0; a < g; a++) {
			ArrayList<String> current = new ArrayList<String>();
			
			for (int b = 0; b < 3; b++) 
				current.add(in.next());
			
			for (int b = 0; b < current.size(); b++) {
				//Friends
				
				if (friends.containsKey(current.get(b))) {
					ArrayList<String> currentArray = friends.get(current.get(b));
					
					for (int c = 0; c < currentArray.size(); c++) {
						if (!current.contains(currentArray.get(c))) {
							counter++;
//							friends.get(currentArray.get(c)).remove(current.get(b));
						}
					}
				}
				
				
				//Enemies
				
				if (enemies.containsKey(current.get(b))) {
					ArrayList<String> currentArray = enemies.get(current.get(b));
					
					for (int c = 0; c < currentArray.size(); c++) {
						if (current.contains(currentArray.get(c))) {
							counter++;
//							enemies.get(currentArray.get(c)).remove(current.get(b));
						}
					}
				}
			}
		}
		System.out.println(counter/2);
	}

}

















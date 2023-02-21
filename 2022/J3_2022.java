package Actual;
import java.util.*;

public class J3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String line = in.nextLine();
		
		ArrayList<Character> numbers = new ArrayList<Character>();
		numbers.add('1'); numbers.add('2'); numbers.add('3'); numbers.add('4'); numbers.add('5'); numbers.add('6');
		numbers.add('7'); numbers.add('8'); numbers.add('9'); numbers.add('0');
		
		int firstWord = 0;
		int lastWord = 0;
//		int current = 0; // or just a
		
		int firstNumber = 0;
		int lastNumber = 0;
		char currentSymbol = ' ';
		
		boolean number = false;
		
		for (int a = 0; a < line.length(); a++) {
			if (a+1 == line.length()) {
				lastNumber = a+1;
				System.out.print(line.substring(firstWord, lastWord));
				System.out.print(currentSymbol == '+' ? " tighten " : " loosen ");
				System.out.println(line.substring(firstNumber, lastNumber));
			}
			
			
			
			if (number) {
				if (!numbers.contains(line.charAt(a))) {
					lastNumber = a;
					
					System.out.print(line.substring(firstWord, lastWord));
					System.out.print(currentSymbol == '+' ? " tighten " : " loosen ");
					System.out.println(line.substring(firstNumber, lastNumber));
					
					firstWord = a;
					number = false;
				} 
				
				
			} else {
				if (line.charAt(a) == '+' || line.charAt(a) == '-') {
					number = true;
					currentSymbol = line.charAt(a);
					firstNumber = a+1;
					lastWord = a;
				}
			}
		}
		

	}

}









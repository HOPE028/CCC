import java.util.Scanner;

public class J3_2022 {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  int numberOfPeople = in.nextInt();

  int[] availability = new int[5];

  char[][] attendance = new char[numberOfPeople][5]; 

  for (int a = 0; a < numberOfPeople; a++) {
   String input = in.nextLine();

   // System.out.println(input);

   for (int b = 0; b < input.length(); b++) {
    attendance[a][b] = input.charAt(b);
 
   }
  }

  for (int a = 0; a < 5; a++) {
   int availableOnDay = 0;

   for (int b = 0; b < attendance.length; b++) {
    if (attendance[b][a] == 'Y') availableOnDay++;
   }

   availability[a] = availableOnDay;
  }

  int highestAvailability = Integer.MIN_VALUE;

  for (int x: availability) {
   if (x > highestAvailability) highestAvailability = x;
  }

  boolean printedOnce = false;

  for (int a = 0; a < 5; a++) {
   if (availability[a] == highestAvailability) {
    if (printedOnce) {
     System.out.print(",");
    } 
    System.out.print((a+1));
    printedOnce = true;
   }
  }
 
 }
}

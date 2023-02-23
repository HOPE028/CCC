import java.util.Scanner;
import java.util.HashMap;

public class J2_2023 {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  HashMap<String, Integer> map = new HashMap<String, Integer>();

  map.put("Poblano", 1500);
  map.put("Mirasol", 6000);
  map.put("Serrano", 15500);
  map.put("Cayenne", 40000);
  map.put("Thai", 75000);
  map.put("Habanero", 125000);

  int number_of_peppers = in.nextInt();

  int spiciness = 0;

  for (int a = 0; a < number_of_peppers; a++) {
   String pepper = in.next();

   spiciness += map.get(pepper);
  }

  System.out.println(spiciness);

 }
}

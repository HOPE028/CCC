import java.util.Scanner;

public class J1_2023 {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  int packages = in.nextInt();
  int collisions = in.nextInt();

  int total = 0;

  total += (packages*50);
  total -= (collisions*10);

  if (packages > collisions) {
   total += 500;
  }

  System.out.println(total);
 }
}
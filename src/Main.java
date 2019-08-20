import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      int input;
      Scanner scanner = new Scanner(System.in);

      do{
         System.out.println("Enter a natural number:");
         input = scanner.nextInt();
      } while(input < 0);

      System.out.println("The result is " + performRecursion(input));

   }

   // Recursion method below
   public static int performRecursion(int number) {
      return number<=0 ? 1 : number*performRecursion(number-1);
   }
}

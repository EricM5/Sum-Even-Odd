import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a series of numbers to display the sum of the even and odd numbers.\nEnter (-1) to see the results.");
    int even = 0;
    int odd = 0;
    int totalsumofeven = 0;
    int totalsumofodd = 0;
    for(;;) {
      int number = in.nextInt();
      if (number == -1) 
        break;
      if (number % 2 == 0) { //check if even
        totalsumofeven += number;
      } else if (number % 2 != 0) { //check if odd
        totalsumofodd += number;
      }
    }
    System.out.println("The sum of all even numbers is: " + totalsumofeven);
    System.out.println("The sum of all odd numbers is: " + totalsumofodd);
  }
}
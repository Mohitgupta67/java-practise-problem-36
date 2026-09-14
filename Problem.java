import java.util.*;

public class Problem {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int original = n;
    int digits = 0;
    int sum = 0;

    int temp = n;
    while (temp != 0) {
      digits++;
      temp = temp / 10;
    }
    // Calculate Armstrong sum
    temp = n;
    while (temp != 0) {
      int digit = temp % 10;
      sum = sum + (int) Math.pow(digit, digits);
      temp = temp / 10;
    }
    // check
    if (sum == original) {
      System.out.println(original + "is  a armstrong number.");
    } else {
      System.out.println(original + "is not an armstrong number");
    }
    sc.close();
  }
}
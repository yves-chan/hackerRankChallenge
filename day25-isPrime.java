import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputs = sc.nextInt();
    for (int i = 0; i < inputs; i++) {
      checkPrime(sc.nextInt());
    }
  }

  static void checkPrime(int number) {
    if (number == 1) {
      System.out.println("Prime");
      return;
    }

    if (number > 2 && number % 2 == 0)  {
      System.out.println("Not prime");
      return;
    }
    for (int i = 3; i < Math.sqrt(number) + 1; i+=2) {
      if (number % i == 0) {
        System.out.println("Not prime");
        return;
      }
    }
    System.out.println("Prime");
  }

}

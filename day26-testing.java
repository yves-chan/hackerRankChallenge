/*
 * The Head Librarian at a library wants you to make a program that calculates the fine for returning the book after the return date. You are given the actual and the expected return dates. Calculate the fine as follows:
 *
 *If the book is returned on or before the expected return date, no fine will be charged, in other words fine is 0.
 *If the book is returned in the same month as the expected return date, Fine = 15 Hackos × Number of late days
 *If the book is not returned in the same month but in the same year as the expected return date, Fine = 500 Hackos × Number of late months
 *
 *If the book is not returned in the same year, the fine is fixed at 10000 Hackos.
 *
 *Good luck!
 *
 *Input Format
 *
 *You are given the actual and the expected return dates in D M Y format respectively. There are two lines of input. The first line contains the D M Y values for the actual return date and the next line contains the D M Y values for the expected return date.
 *
 *Output Format
 *
 *Output a single value equal to the fine.
 *
 *Sample Input
 *
 *9 6 2015
 *6 6 2015
 *
 *Sample Output
 *
 *45
 */
import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int actualDay = sc.nextInt();
    int actualMonth = sc.nextInt();
    int actualYear = sc.nextInt();

    int expectedDay = sc.nextInt();
    int expectedMonth = sc.nextInt();
    int expectedYear = sc.nextInt();

    final int DAILY_FINE = 15;
    final int MONTHLY_FINE = 500;
    final int MAX_FINE = 10000;

    int total = 0;

    if (actualYear > expectedYear) {
      total += MAX_FINE;
    } else if (actualMonth > expectedMonth) {
        int monthDifference = (actualMonth-expectedMonth) * MONTHLY_FINE;
        total += monthDifference;
      }
      else if (actualDay > expectedDay) {
          int dayDifference = (actualDay-expectedDay) * DAILY_FINE;
          total += dayDifference;
      }
    System.out.println(total);
  }
}

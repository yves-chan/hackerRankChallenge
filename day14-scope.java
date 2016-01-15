/*
 * There is a class Difference given in the editor with one private instance array elements which stores the N non negative integers and public integer maxDifference to store the greatest absolute difference between the two of the N integers.
 *
 * Code for handling input/output is already given in the editor. Your task is to write the constructor for the class Difference and the method computeDifference which finds the greatest absolute difference between any two numbers in the input array and stores it in maxDifference.
 *
 * Good Luck!
 *
 * Input Format
 *
 * First line contains an integer N representing size of the array. Next line contains N integers separated by space.
 *
 * Constraints
 * 1≤N≤10
 * 1≤elements[i]≤100 where 1≤i≤N
 *
 * Output Format
 *
 * Output the the greatest absolute difference between two of N integers in the array.
 *
 * Sample Input
 *
 * 3
 * 1 2 5
 *
 * Sample Output
 *
 * 4
 *
 * Explanation
 *
 * |1-2|=1
 * |1-5|=4
 * |2-5|=3
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  private int[] elements;
  public int maximumDifference;
  public Difference(int[] elements){
    this.elements = elements;
    maximumDifference = 0;
  }

  void computeDifference() {
    for (int i = 0; i < elements.length; i++){
      for (int j = elements.length-1; j>i; j--){
        int difference = Math.abs(elements[i] - elements[j]);
        if (maximumDifference < difference) {
          maximumDifference = difference;
        }
      }
    }
  }
}

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }

    Difference D = new Difference(a);

    D.computeDifference();

    System.out.print(D.maximumDifference);
  }
}

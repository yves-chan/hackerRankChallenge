/*
 * Input Format
 The string will only contain lower case english alphabets, upper case english alphabets, blank spaces and this special characters: ![,?.\_'@+].

 Constraints
 1≤|S|≤400000

 Output Format
 In the first line, print number of words in the string. The words don't need to be unique. Also print each word in a separate line.

 Sample Input

 He is a very very good boy, isn't he?

 Sample Output

 10
 He
 is
 a
 very
 very
 good
 boy
 isn
 t
 he
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    StringTokenizer st = new StringTokenizer(input, "!][,?.\\'@+ _" );
    System.out.println(st.countTokens());
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}

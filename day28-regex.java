/*Input Format
 *
 * The first line of input contains an integer, T (the number of test cases).
 * The T subsequent lines of test cases each contain a string of characters describing a RegEx.
 *
 * Constraints
 * 1≤T≤100
 *
 * Output Format
 *
 * On a new line for each test case, print Valid if the given RegEx's syntax is correct; otherwise, print Invalid.
 *
 * Sample Input
 *
 * 3
 * ([A-Z])(.+)
 * [AZ[a-z](a-z)
 * batcatpat(nat
 *
 * Sample Output
 *
 * Valid
 * Invalid
 * Invalid
 */
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    while(testCases>0){
      String pattern = in.nextLine();
      testCases--;
      try  {
        Pattern p = Pattern.compile(pattern);
      } catch (PatternSyntaxException e) {
        System.out.println("Invalid");
        continue;
      }
      System.out.println("Valid");
    }
  }
}

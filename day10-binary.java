/*
Input Format

The first line contains a single integer, T, the number of test cases. The T subsequent lines of test cases each contain a single value, n, the base 10 positive integer to be converted.

Constraints
1≤T≤1000
1≤n≤231

Output Format

For each test case, print the value of n in binary on a new line.

Sample Input

2
4
5

Sample Output

100
101

Explanation

Test Case 0: n=4 evaluates to 1×22+0×21+0×20=1×4+0+0=100.
Test Case 1: n=5 evaluates to 1×22+0×21+1×20=1×4+0+1×1=101.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int inputs = sc.nextInt();

        for (int i = 0; i<inputs; i++) {
            int dec = sc.nextInt();
            int exp = getLargeExp(dec, 0);
            String answer = convertDec(dec, exp);
            System.out.println(answer);

        }
    }

    public static String convertDec(int dec, int exp){
        int currentValue = (int) Math.pow(2,exp);
        if (exp == 0) {
            //Base case for last digit if odd or even
            if (dec == currentValue){
                return "1";
            } else {
                return "0";
            }
        } else
        if (dec >= currentValue) {
            return "1" + convertDec(dec-currentValue, exp-1);
        } else {
            return "0" + convertDec(dec, exp-1);
        }
    }

    //Return the largest exponent
    public static int getLargeExp(int dec, int exp){
        if (dec < Math.pow(2,exp)) {
            return exp-1;
        } else {
            int newExp = exp+1;
            return getLargeExp(dec, newExp);
        }
    }
}

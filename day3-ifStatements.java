/*
This problem will test your knowledge on "if-else" statements.

Given an integer N as input, check the following:

    If N is odd, print "Weird".
    If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
    If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
    If N is even and N>20, print "Not Weird".

We have given you partially completed code in the editor, complete it to solve the problem.

Input Format

There is a single line of input: integer N.

Constraints
1≤N≤100

Output Format

Print "Weird" if the number is weird. Otherwise, print "Not Weird". Do not print the quotation marks.

Sample Input 1

3

Sample Output 1

Weird


Explanation
N=3, is odd hence the its a Weird Number.

Sample Input 2

24

Sample Output 2

Not Weird


Explanation
N=24, is >20 hence its not a Weird Number.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans;
        if(n%2==1)ans = "Weird";
        else if (n%2==0 && n>=2 && n<=5) {
                ans = "Not Weird";
        } else if (n%2==0 && n>=6 && n<=20) {
            ans = "Weird";
        } else
            ans = "Not Weird";
        System.out.println(ans);

    }
}

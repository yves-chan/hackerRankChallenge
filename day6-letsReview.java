/*
Your teacher has given you the task of drawing a staircase structure. Being an expert programmer, you decided to make a program to draw it for you instead. Given the required height, can you print a staircase as shown in the example?
Note: The last line has zero spaces before it.

Good luck!

Constraints
1≤N≤100

Input Format

You are given an integer N depicting the height of the staircase.

Output Format

Print a staircase of height N that consists of # symbols and spaces as given in Sample Output.

Sample Input

6

Sample Output

     #
    ##
   ###
  ####
 #####
######

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int noStairs = scanner.nextInt();
        for (int i = 1; i <= noStairs; i++) {
            String toPrint = "";
            for (int j = 1; j <= noStairs; j++){
                if ((noStairs - j) >= i) {
                    toPrint += " ";
                } else {
                    toPrint += "#";
                }
            }
            System.out.println(toPrint);
        }
    }
}

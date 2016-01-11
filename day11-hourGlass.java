/*
Given a 6×6 2D Array, A:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

We can find 16 hourglasses in A; we define an hourglass in A to be a subset of values with indexes falling in this pattern in A's graphical representation:

a b c
  d
e f g

The sum of an hourglass is the sum of the values within it.

Your task is to calculate the sum of every hourglass in some 2D Array, A, and print the largest value (maximum of the sums) as your answer.

Input Format

There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A; every value in A will be in the inclusive range of −9 to 9.

Constraints
−9≤A[i][j]≤9
0≤i,j≤5

Output Format

Print the largest (maximum) hourglass sum found in A.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output

19

Explanation

Sample Input A contains the following hourglasses:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0

The hourglass with the maximum sum (19) is:

2 4 4
  2
1 2 4

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static MIN_POSSIBLE_VALUE = -63;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int maxSum = MIN_POSSIBLE_VALUE;
        //Generate the 4x4 hour glasses
        for (int bigI = 0; bigI<4; bigI++){
            for (int bigJ = 0; bigJ<4; bigJ++){

                //Process the hour glasses to find the sums
                int sum = 0;
                for (int i = bigI; i < bigI+3; i++) {
                    for (int j = bigJ; j < bigJ+3; j++){
                        sum += arr[i][j];
                    }
                }
                //Minus the middle part of the 3x3 matrix to get hourglass shape
                sum = sum - (arr[bigI+1][bigJ] + arr[bigI+1][bigJ+2]);
                //replace maxSum if we found it
                if (sum > maxSum) {
                    maxSum = sum;
                }

            }
        }

        System.out.println(maxSum);
    }
}

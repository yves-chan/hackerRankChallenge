/*
Input Format

The first line of input contains N, the number of integers. The next line contains N integers separated by a space.

Constraints

1≤N≤1000

1≤Ai≤10000, where Ai is the ith integer in the array.

Output Format

Print the N integers of the array in the reverse order on a single line separated by a space.

Sample Input

4
1 4 3 2

Sample Output

2 3 4 1
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
        }

        for (int i = N-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Given a list A={a0,a1,…,aN−1} of unsorted integers, find and print the pair (or pairs) of elements having the minimum absolute difference.

Note: More than one pair of elements may have the same absolute difference.

Input Format

The first line contains a single integer N, denoting the length of list A.
The second line contains N space-separated integers, a0,a1,…,aN−1, representing the elements in A.

Constraints

    2≤N≤2×105
    −107≤Ai≤107
    Ai≠Aj,where 0≤i<j≤N−1

Output Format

Print the space-separated pair of elements having the minimum absolute difference in ascending order.
If more than one pair meets this criterion, print them consecutively, separated by a space, in ascending order on a single line.
Because we are printing space-separated pairs, some elements may appear more than once in your output.

Sample Input 1

10
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854

Sample Output 1

-20 30

Explanation
The minimum absolute difference is 50 (ABS(30−(−20))=50). The only pair having this difference is (−20,30).

Sample Input 2

12
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470

Sample Output 2

-520 -470 -20 30

Explanation
Our minimum absolute difference is 50. The pairs (−470,−520) and (−20,30) both have this difference.

Sample Input 3

4
5 4 3 2

Sample Output 3

2 3 3 4 4 5

Explanation
Our minimum absolute difference is 1. The pairs (2,3), (3,4), and (4,5) all have this difference.
Notice that 3 and 4 appear multiple times, because they are components of more than one pair.

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] intArr = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            intArr[i] = sc.nextInt();
        }

        //Sort the array using insertion Sort
        int[] sortedArray = insertionSort(intArr);

        //Find the minimum difference
        //Start with max difference
        int minimumDifference = 20000000;
        for (int i = 0; i < arraySize-1; i++) {
            if ( Math.abs(sortedArray[i] - sortedArray[i+1]) < minimumDifference ) {
                minimumDifference = Math.abs(sortedArray[i] - sortedArray[i+1]);
            }
        }

        //Print all pairs with the minimum difference
        for (int i = 0; i < arraySize-1; i++) {
            if (Math.abs(sortedArray[i] - sortedArray[i+1]) == minimumDifference) {
                System.out.print(sortedArray[i] + " " + sortedArray[i+1] + " ");
            }
        }



    }

    static int[] insertionSort(int[] array) {
        int i, j, key;
        for (i = 1; i < array.length; i++) {
            key = array[i];
            j = i-1;
            while (j>=0 && key < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        return array;
    }


}

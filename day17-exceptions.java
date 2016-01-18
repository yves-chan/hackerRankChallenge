/*
Input Format

First line contains T, the number of test cases. Next T lines contain two integers n and p separated by a space.

Output Format

Output T lines. For each test case if n and p are positive then print np else print "n and p should be non-negative" without quotes.

Sample Input

4
3 5
2 4
-1 -2
-1 3

Sample Output

243
16
n and p should be non-negative
n and p should be non-negative

Explanation

T=4
In the first test case both integers are positive hence the output is 35=243
In the second test case both integers are positive hence the output is 24=16
In the third test case both the integers are negative hence the output is "n and p should be non-negative"
In the fourth test case n is negative hence the output is "n and p should be non-negative"
*/

import java.util.*;
import java.io.*;

class Calculator {

    Calculator(){};

    int power(int n, int p) throws Exception {
        if (n<0 || p<0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(n,p);
    }
}

class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}

/*
Input Format

The first line will have an integer N denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain name of a friend. Read the queries until end-of-file.

Constraints
A name consists of only lower-case English letters and it may be in the format
'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.

1≤N≤104
1≤queries≤104

Output Format

For each case, print "Not found" without quotes, if the friend has no entry in the phone book. Otherwise, print the friend's name and phone number. See sample output for the exact format.

To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.

Sample Input

3
sam
99912222
tom
11122222
harry
12299933
sam
edward
harry

Sample Output

sam=99912222
Not found
harry=12299933

*/

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      Map<String, Integer> phoneBook = new HashMap<>();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         phoneBook.put(name, phone);
         in.nextLine();
      }

       //Result
      while(in.hasNext())
      {
         String s=in.nextLine();
          if (phoneBook.containsKey(s)){
              System.out.println(s+"="+phoneBook.get(s));
          } else {
              System.out.println("Not found");
          }
      }
   }
}

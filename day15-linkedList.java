/*
 * Input Format
 *
 * First line contains T, the number of testcases. Each test case contains an integer to be inserted at tail of linked list.
 *
 * Output Format
 *
 * Output the data in each node separated by space.
 *
 * Sample Input
 *
 * 4
 * 2
 * 3
 * 4
 * 1
 *
 * Sample Output
 *
 * 2 3 4 1
 *
 * Explanation
 *
 * T=4
 * Initially head is null and 2 is inserted. 3,4,1 are inserted at the tail of linked list hence the linked list becomes 2 3 4 1
 */

import java.io.*;
import java.util.*;
class Node{
  int data;
  Node next;
  Node(int d){
    data=d;
    next=null;
  }

}
class Solution
{
  public static  Node insert(Node head,int data)
  {
    if (head == null) {
      head = new Node(data);
      return head;
    }

    Node current = head;
    Node newNode = new Node(data);
    while(current.next != null) {
      current = current.next;
    }
    current.next = newNode;
    return head;
  }
  public static void display(Node head)
  {
    Node start=head;
    while(start!=null)
    {
      System.out.print(start.data+" ");
      start=start.next;
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    Node head=null;
    int N=sc.nextInt();
    while(N-->0){
      int ele=sc.nextInt();
      head=insert(head,ele);
    }
    display(head);

  }
}


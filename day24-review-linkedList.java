/*
 * Input Format
 *
 * First line contains T, the number of testcases. Each test case contains an integer data to be inserted at tail of linked list.
 * Note: The input data for each test case is always given in non-decreasing order.
 *
 * Output Format
 *
 * Print the data in each node of linked list separated by a space after the deletion of duplicates as given in problem statement.
 *
 * Sample Input
 *
 * 6
 * 1
 * 2
 * 2
 * 3
 * 3
 * 4
 *
 * Sample Output
 *
 * 1 2 3 4 
 *
 * Explanation
 *
 * T = 6
 * 2 and 3 are repeated so after deleting the nodes with repeated values the linked list becomes
 *
 * 1 2 3 4
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
  public static Node removeDuplicates(Node head) {

    if (head != null) {

      Node tempHead = head;

      while (tempHead.next != null) {
        if (tempHead.data == tempHead.next.data) {
          tempHead.next = tempHead.next.next;
        } else {
          tempHead = tempHead.next;
        }
      }
    }
    return head;
  }
  public static  Node insert(Node head,int data)
  {
    Node p=new Node(data);     
    if(head==null)
      head=p;
    else if(head.next==null)
      head.next=p;
    else
    {
      Node start=head;
      while(start.next!=null)
        start=start.next;
      start.next=p;

    }
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
    int T=sc.nextInt();
    while(T-->0){
      int ele=sc.nextInt();
      head=insert(head,ele);
    }
    head=removeDuplicates(head);
    display(head);

  }
}

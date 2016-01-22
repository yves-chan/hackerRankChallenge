/*
 * Input Format
 *
 * First line contains T, the number of test cases. Next T lines contain an integer data to be added to the binary search tree.
 *
 * Output Format
 *
 * Output the height of the binary search tree.
 *
 * Sample Input
 *
 * 7
 * 3
 * 5
 * 2
 * 1
 * 4
 * 6
 * 7
 *
 * Sample Output
 *
 * 4
 */

import java.util.*;
import java.io.*;
class Node{
  Node left,right;
  int data;
  Node(int data){
    this.data=data;
    left=right=null;
  }
}
class Solution{
  public static int getHeight(Node root){
    //Base Case: null root has height 0;
    if (root == null) {
      return 0;
    }

    //Which side is deeper?
    int leftSide = getHeight(root.left);
    int rightSide = getHeight(root.right);

    //return the deeper side
    if (leftSide > rightSide) { 
      return leftSide + 1;
    } else {
      return rightSide + 1;
    }
  }
  public static Node insert(Node root,int data){
    if(root==null){
      return new Node(data);
    }
    else{
      Node cur=new Node(data);
      if(data<=root.data){
        cur=insert(root.left,data);
        root.left=cur;
      }
      else{
        cur=insert(root.right,data);
        root.right=cur;
      }
      return root;
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    Node root=null;
    while(T-->0){
      int data=sc.nextInt();
      root=insert(root,data);
    }
    int height=getHeight(root);
    System.out.println(height);
  }
}

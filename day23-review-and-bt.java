/*
 * Input Format
 *
 * First line contains T, the number of test cases. Next T lines contain an integer data to be added to the binary search tree.
 *
 * Output Format
 *
 * Print the values of the level order traversal separated by spaces.
 *
 * Sample Input
 *
 * 6
 * 3
 * 5
 * 4
 * 7
 * 2
 * 1
 *
 * Sample Output
 *
 * 3 2 5 1 4 7 
 *
 * Explanation
 *
 * Level 1:        3
 *               /   \
 * Level 2:     2     5
 *             /     /\
 * Level 3:   1     4  7 
 *
 * We need to print the nodes level by level. We process each level from left to right.
 * Level Order Traversal: 3 -> 2 -> 5 -> 1 -> 4 -> 7
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
  static void levelOrder(Node root){
    Queue<Node> nodeQueue = new LinkedList<>();
    int levelNodes =0;
    //exit if no root
    if(root==null) return;

    //add the first root
    nodeQueue.add(root);

    while(!nodeQueue.isEmpty()){
      //current nodes in the level
      levelNodes = nodeQueue.size();

      while(levelNodes>0){
        Node currentNode = nodeQueue.remove();
        System.out.print(currentNode.data + " ");

        if(currentNode.left!=null) {
          nodeQueue.add(currentNode.left);
        }
        if(currentNode.right!=null) { 
          nodeQueue.add(currentNode.right);
        }

        levelNodes--;
      }
    }
  }
  public static Node insert(Node root,int data){
    if(root==null){
      return new Node(data);
    }
    else{
      Node cur;
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
    levelOrder(root);
  }
}

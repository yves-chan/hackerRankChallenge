/*
 * Input Format
 *
 * Input from STDIN is already handled in the code given in the editor. MyBook's constructor must have the following parameters: String title, String author, and int price.
 *
 * Output Format
 *
 * The void display() method should print and label the respective title, author, and price of the book's instance (with each value on its own line) like so:
 *
 * Title: $title
 * Author: $author
 * Price: $price
 *
 * Note: The $ is prepended to variable names to indicate they are placeholders for variables.
 *
 * Sample Input
 *
 * The Alchemist
 * Paulo Coelho
 * 248
 *
 * Sample Output
 *
 * Title: The Alchemist
 * Author: Paulo Coelho
 * Price: 248
 */

import java.util.*;
abstract class Book
{
  String title;
  String author;
  Book(String t,String a){
    title=t;
    author=a;
  }
  abstract void display();


}
//Write MyBook Class

class MyBook extends Book {
  private int price;

  public MyBook(String title, String author, int price) {
    super(title, author);
    this.price = price;
  }

  void display() {
    System.out.println("Title: " + this.title);
    System.out.println("Author: " + this.author);
    System.out.println("Price: " + this.price);
  }
}

public class Solution
{

  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    String title=sc.nextLine();
    String author=sc.nextLine();
    int price=sc.nextInt();
    Book new_novel=new MyBook(title,author,price);
    new_novel.display();

  }
}

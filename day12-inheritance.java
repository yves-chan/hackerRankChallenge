/*
You are given two classes, Student and Grade, where Student is the base class and Grade is the derived class. Completed code for Student and stub code for Grade are provided for you in the editor. Note that Grade inherits all the properties of Student.

Complete the Grade class by writing a class constructor (Grade(String,String,int,int)) and a char calculate() method. The calculate method should return the character representative of a Student's *Grade. Score as defined in this chart: [Screen Shot 2016-01-08 at 8.49.10 AM.png]

Input Format

Input is already handled for you by the code pre-filled in the editor. There are 4 lines of input containing first name, last name, phone, and score, respectively.

Constraints
4≤|first name|,|last name|≤10
phone contains exactly 7 digits
1≤score≤100

Output Format

Output is already handled for you by the code pre-filled in the editor. Your output will be correct if your Grade class constructor and calculate method are properly written.
Sample Input

 Heraldo
 Memelli
 8135627
 90

Sample Output

 First Name: Heraldo
 Last Name: Memelli
 Phone: 8135627
 Grade: O
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   protected String firstName;
   protected String lastName;
   int phone;
   Student(String fname,String lname,int p){
         firstName=fname;
         lastName=lname;
         phone=p;

   }
   public void display(){// display the details of the student
       System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nPhone: "+phone);
   }

}

class Grade extends Student{
   private int score;

    Grade(String fname, String lname, int phone, int grade) {
        super(fname,lname,phone);
        this.score = grade;
    }

    char calculate(){
        if (score <40) {
            return 'D';
        } else if (score >= 40 && score < 60) {
            return 'B';
        } else if (score >= 60 && score < 75) {
            return 'A';
        } else if (score >= 75 && score <90) {
            return 'E';
        } else {
            return 'O';
        }
    }

}

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        int phone=sc.nextInt();
        int score=sc.nextInt();
        Student stu=new Grade(firstName,lastName,phone,score);
        stu.display();
        Grade g=(Grade)stu;
        System.out.println("Grade: "+g.calculate());

    }
}

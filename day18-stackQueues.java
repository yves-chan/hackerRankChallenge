/*
Write the following four functions/methods in class Palindrome:

    void pushCharacter(char ch): Pushes a character onto a stack.
    void enqueueCharacter(char ch): Enqueues a character in a queue.
    char popCharacter(): Pops and returns the top character.
    char dequeueCharacter(): Dequeues and returns the first character.

Code handling Input/Output and determining if s is palindrome is provided in the editor.

Input Format

A single line containing string s.

Note: s will always be lowercase.

Output Format

If s is a palindrome, print "The word, s, is a palindrome."
Otherwise, print "The word, s, is not a palindrome." without quotes

Sample Input

racecar

Sample Output

The word, racecar, is a palindrome.
*/

import java.io.*;
import java.util.*;

class Palindrome {
    Stack<Character> charStack;
    LinkedList<Character> charQueue;

    Palindrome() {
        charStack = new Stack<>();
        charQueue = new LinkedList<>();
    }

    void pushCharacter(char ch) {
        charStack.push(ch);
    }

    void enqueueCharacter(char ch) {
        charQueue.add(ch);
    }

    char popCharacter() {
        return charStack.pop();
    }

    char dequeueCharacter(){
        return charQueue.remove();
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // read the string s.
        String s = sc.nextLine();

        // create the Palindrome class object p.
        Palindrome p = new Palindrome();
        char arr[]=s.toCharArray();//Converting string to a character array
        // push all the characters of string s to stack.
        for (char c : arr) {
            p.pushCharacter(c);
        }

        // enqueue all the characters of string s to queue.
        for (char c : arr) {
            p.enqueueCharacter(c);
        }

        boolean f = true;

        // pop the top character from stack.
        // dequeue the first character from queue.
        // compare both the characters.
        for (int i = 0; i < s.length(); i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                f = false;
                break;
            }
        }

        // finally print whether string s is palindrome or not.
        if (f) {
            System.out.println("The word, "+s+", is a palindrome.");
        } else {
            System.out.println("The word, "+s+", is not a palindrome.");
        }
    }
}

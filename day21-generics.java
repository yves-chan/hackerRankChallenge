/*
 * You are given code in the editor. Complete the code so that it prints the following lines:
 *
 * 1
 * 2
 * 3
 * Hello
 * World
 */

import java.io.IOException;
import java.lang.reflect.Method;
class Printer
{
  Printer() {};

  void printArray( Object[] array ) {
    for (Object object : array) {
      System.out.println(object);
    }
  }

}public class Solution
{


  public static void main( String args[] )
  {
    Printer myPrinter=new Printer();
    Integer[] intArray = { 1, 2, 3 };
    String[] stringArray = {"Hello","World"};
    myPrinter.printArray( intArray  );
    myPrinter.printArray( stringArray );
    int count=0;
    for (Method method : Printer.class.getDeclaredMethods()) {
      String name = method.getName();
      if(name.equals("printArray"))
        count++;
    }

    if(count>1)System.out.println("Method overloading is not allowed!");
    assert count==1;

  }
}

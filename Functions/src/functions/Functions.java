/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Functions {
    private static int addNumbers(int a, int b) {
        int c;
        c = a + b;
        return c;
    }
    private static int subtractNumbers(int a, int b) {
        int c;
        c = a - b;
        return c;
    }
    private static int multiplyNumbers(int a, int b) {
        int c;
        c = a * b;
        return c;
    }
    private static int divideNumbers(int a, int b) {
        int c;
        c = a / b;
        return c;
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("Basic math algorithim");
      Scanner s = new Scanner(System.in);
      int a, b;
      String c;
      boolean condition = true;
      while(condition) {
     System.out.println("What algorithim do you wan to do ?"
                    + "" + "\n"  +"1. Sum" 
                    + "\n"  +"2. Divide"+ 
                    "\n"  +"3. Multiply"
                    + "\n" + "4. Subtract");
      
       c = s.next();
      System.out.println("Enter first number");
      a = s.nextInt();
      System.out.println("Enter second number");
      b = s.nextInt();
      if(c.equals("1")) {
      System.out.println("Sum = " + addNumbers(a, b));
      }
      else if(c.equals("3")) {
      System.out.println("Division = " + divideNumbers(a, b));
      }
       else if(c.equals("3")) {
      System.out.println("Multiply = " + multiplyNumbers(a, b));
      }
          else if(c.equals("5")) {
      condition = false;
      }
     else {
       System.out.println("Subtration = " + subtractNumbers(a, b));
       }
      }        
    }}

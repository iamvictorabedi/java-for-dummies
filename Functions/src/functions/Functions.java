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
      Scanner s = new Scanner(System.in);
      System.out.println("Basic math algorithim");
      int a, b, c;
      boolean condition = true;
      while(condition) {
     System.out.println("What algorithim do you wan to do ?"
                    + "" + "\n"  +"1. Sum" 
                    + "\n"  +"2. Divide"+ 
                    "\n"  +"3. Multiply"
                    + "\n" + "4. Subtract"
                        + "\n" + "5. Exit");
      
       c = s.nextInt(); 
       
     if(c == 5){
        break;
        }
     
      System.out.println("Enter first number");
      a = s.nextInt();
      
      System.out.println("Enter second number");
      b = s.nextInt();
          switch (c) {
              case 1:
                  System.out.println("Sum = " + addNumbers(a, b));
                  break;
              case 2:
                  System.out.println("Division = " + divideNumbers(a, b));
                  break;
              case 3:
                  System.out.println("Multiply = " + multiplyNumbers(a, b));
                  break;
              case 4:
                  System.out.println("Subtration = " + subtractNumbers(a, b));
                  break;            
              default:
                  System.out.println("Invalid Entry");
                  break;
          }
      }        
    }}

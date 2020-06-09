/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labone;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Land {
    private int length;
    private int width;
    private int area;
    
 public void getData() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter farm length");
       length = s.nextInt();
       System.out.println("Enter farm length");
       width = s.nextInt();
       calucateArea(length, width);
}

private void calucateArea(int l, int w) {
    area = l * w;
    System.out.println("Area of your farm = " + area);
}
    
}

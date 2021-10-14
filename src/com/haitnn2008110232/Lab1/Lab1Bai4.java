package com.haitnn2008110232.Lab1;
import java.util.Scanner;
public class Lab1Bai4 {
    public static void main(String[] args) {
        double a, b, c, delta;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập a: ");
        a = scanner.nextDouble();
       
        System.out.print("Nhập b: ");
        b = scanner.nextDouble();

        System.out.print("Nhập c: ");
        c = scanner.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("Delta bằng: "+delta);        
    }
    
}

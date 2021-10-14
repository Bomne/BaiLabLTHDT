package com.haitnn2008110232.Lab1;
import java.util.Scanner;
public class Lab1Bai3 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào 1 cạnh của khối lập phương: ");

        int a = scanner.nextInt();

        double v = a*a*a;
        
        System.out.println("=======================");
        System.out.println("Thể tích khối lập phương là: "+v);
    }

    
}

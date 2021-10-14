package com.haitnn2008110232.Lab2;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args){
        int a, b;
        double x;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        a = scanner.nextInt();
        System.out.print("nhập số b: ");
        b = scanner.nextInt();
        
        System.out.println("Phương trình bạn vừa nhập là: "+a+"x + "+b+" = 0");
        if(a==0){
            if(b==0){
                System.out.print("Phương trình vô số nghiệm");
            }else {
                System.out.print("Phương trình vô nghiệm");
            }
        } else {
            x = (double) -b/a;
            System.out.println("Phương trình có nghiệm x= "+x);
        }

    }
    
}

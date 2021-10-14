package com.haitnn2008110232.Lab1;
import java.util.Scanner;
public class Lab1Bai2{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhập vào chiều dài của hình chữ nhật: ");
        int cd = scanner.nextInt();

        System.out.printf("Nhập vào chiều rộng của hình chữ nhật:");
        int cr = scanner.nextInt();

        double cv = (cd+cr)*2;
        double dt = cd*cr;
        double min = Math.min(cd,cr);

        System.out.println("------------------------------------------");
        System.out.println("Chu Vi HCN là: "+cv);
        System.out.println("Diện tích hình chữ nhật là:"+dt);
        System.out.println("Cạnh nhỏ nhất là: "+min);
        
        
        
    }
}

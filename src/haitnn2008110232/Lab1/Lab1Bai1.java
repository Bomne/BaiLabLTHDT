package haitnn2008110232.Lab1;

import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args){
        String hoten;
        Float diem;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
         hoten = scanner.nextLine();

        System.out.print("Điểm số: ");
         diem = scanner.nextFloat();

        System.out.println("=====================");

        System.out.printf("Họ tên: "+hoten+"  được "+diem+"  điểm");
    }
}

   
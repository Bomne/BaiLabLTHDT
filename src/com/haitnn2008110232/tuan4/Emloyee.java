package com.haitnn2008110232.tuan4;
import java.util.Scanner;
public class Emloyee {
    String Name;
    float luong;
    int soLuongNhanVien ;
    Emloyee(){
        
    }
    void getName(){        
            System.out.print("Nhập tên của nhân viên: ");
            Scanner nhap = new Scanner(System.in);
            Name = nhap.nextLine(); 
    }
    void getluong(){
            System.out.print("Nhập lương của nhân viên: ");
            Scanner nhap = new Scanner(System.in);
            luong = nhap.nextFloat();
        
    }
    void printInfomationEmployee(){
       
            System.out.println("Tên nhân viên là: " + Name);
            System.out.println("Lương của nhân viên: " + luong);
    }
}

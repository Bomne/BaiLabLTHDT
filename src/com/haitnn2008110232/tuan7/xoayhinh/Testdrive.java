package com.haitnn2008110232.tuan7.xoayhinh;
import java.util.Scanner;
public class Testdrive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int luachon;
        do{
            System.out.println("----------GEOMETRY----------");
            System.out.println("1. Hình vuông");
            System.out.println("2. Hình tròn");
            System.out.println("3. Hình tam giác");
            System.out.println("4. Amoeba");
            System.out.println("anyNumber. Kết thúc!!!");
            System.out.println("-----------------------------");
            System.out.print("Chọn chức năng: ");
            luachon = sc.nextInt();
            switch(luachon){
                case 1:
                    Hinhvuong hv = new Hinhvuong(true);
                    hv.getClick(); 
                    break;

                case 2:
                    Hinhtron ht = new Hinhtron(true);
                    ht.getClick();   
                    break;

                case 3:
                    Hinhtamgiac htg = new Hinhtamgiac(true);
                    htg.getClick();
                    break;

                case 4:
                    Amoeba a = new Amoeba(9,3,true);
                    a.getClick();
                    break;

            }
        }while(luachon <= 4 && luachon > 0);
        
    }
}

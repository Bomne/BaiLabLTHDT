package Test;
import java.util.Scanner;
public class test5 {
    public static void main(String[] args){
      
    Scanner scanner = new Scanner(System.in);
    int nhap;      
        do{
            System.out.println("==========MENU==========");
        System.out.println("1. Giả phương trình bậc nhất!");
        System.out.println("2. Giải phương trình bậc hai!!");
        System.out.println("3. Tính tiền điện!!!");

        System.out.println("Hãy chọn chức năng~~");
         nhap = scanner.nextInt();
        
        switch(nhap){
            case 1: giaiPT1(); break;
            case 2: giaiPT2(); break;
            case 3: tiendien(); break;
            default: System.out.println("Nhập sai!!! Hãy nhập lại");
        }
    }while( nhap >= 1 || nhap <= 3);        
}
    static void giaiPT1(){
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
    static void giaiPT2(){
        int a, b, c;
        double x, x1, x2, delta;
        String ketqua = "" ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        b = scanner.nextInt();
        System.out.print("Nhập số c: ");
        c = scanner.nextInt();

        System.out.println("Phương trình bạn vừa nhập là: "+a+"x^2 + "+b+"x + "+c+" = 0");
        delta = Math.pow(b, 2) - 4*a*b;
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.print("Phương trình vô số nghiệm");
                }else {
                    System.out.print("Phương trình vô nghiệm");
                }
            } else {
                x = (double) -c/b;
                System.out.println("Phương trình có nghiệm x= "+x);

            }          
        }else if( delta < 0){
            ketqua = "Phương trình vô nghiệm!!!";
        }else if(delta == 0){
            x1 = x2 = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép là: "+x1);
        }else {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            ketqua = "Phương trình có 2 nghiệm phân biệt x1="+x1+" và x2 "+x2+"";
        }
        System.out.println(ketqua);
    }
    static void tiendien(){
        Scanner scanner = new Scanner(System.in);
        double sodien, tiendien;

        System.out.print("Nhập vào số điện trong tháng: ");
        sodien = scanner.nextDouble();
        
        if (sodien<50){
            tiendien = sodien * 1000;
        } else {
            tiendien = 50 * 1000 + (sodien-50)*1200;
        }
        System.out.print("Số tiền điện bạn sử dụng là "+tiendien+" nghìn đồng");
    }
    
}

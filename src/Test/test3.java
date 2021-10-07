package Test;

import java.util.Scanner;
public class test3 {
 
    public static void main(String[] args){
        int a, b, c;
        double x, x1, x2, delta;
        String ketqua = "" ;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhập số a: ");
        a = scanner.nextInt();
        System.out.printf("Nhập số b: ");
        b = scanner.nextInt();
        System.out.printf("Nhập số c: ");
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
}

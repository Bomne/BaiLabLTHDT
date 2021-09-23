import java.util.Scanner;
public class Lab1Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhạp vào 1 cạnh của khối lập phương: ");
        double a = sc.nextDouble();
        double v = a*a*a;
        System.out.println("=======================");
        System.out.println("Thể tích khối lập phương là: "+v);
    }

    
}

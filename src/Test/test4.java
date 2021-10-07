package Test;
import java.util.Scanner;
public class test4 {
    public static void main(String[] args){
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

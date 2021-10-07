package Test;
import java.util.Scanner;
public class test1 {
    public static void show(int number, int blance){
        System.out.println("Account Number = "+number);
        System.out.println("Account Blance = "+blance);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        int nhap;
        do{
            System.out.println("===========MENU==========");
            System.out.println("1. Gửi tiền vào tài khoản.");
            System.out.println("2. Rút tiền.");
            System.out.println("=========================");
            System.out.printf("Hãy chọn chức năng.");
            nhap = sc.nextInt();

            switch(nhap){
                case 1: guiTien(); break;
                case 2: rutTien(); break;
                default: System.out.println("Nhập sai!! Hãy nhập lại");
            }
            }while(nhap>=1 || nhap<=2);
        }

        static void guiTien(){
            Scanner sc = new Scanner(System.in);
            int account_number = 20;
            int account_blance = 100;
            System.out.printf("Nhập số tiền muốn gửi: ");
            int guitien = sc.nextInt();
            account_blance = account_blance + guitien;
            show(account_number,account_blance);  
        }
        static void rutTien(){
            Scanner sc = new Scanner(System.in);
            int account_number = 20;
            int account_blance = 100;
            System.out.printf("Nhập số tiền muốn rút: ");
            int ruttien = sc.nextInt();

        

        account_blance = account_blance - ruttien;
        show(account_number, account_blance);
        }
    
}
    


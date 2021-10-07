package Test;

public class Laptrinhcocautruc {
  

    
    public static void main(String[] args){
        int account_number = 20;
        int account_blance = 100;

        account_blance = account_blance + 100;
        show(account_number,account_blance);
        account_blance = account_blance - 30;
        show(account_number, account_blance);
    }

    public static void show(int account_number, int account_blance){
        System.out.println("Số tài khoản: "+account_number);
        System.out.println("Số dư hiện tại: "+account_blance);
    }

    
}

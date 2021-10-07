package Test;

public class Account {
    int account_number;
        int account_blance;
        
        public void show(int account_number, int account_blance){
        System.out.println("Account Number: "+account_number);
        System.out.println("Account Blance: "+account_blance);
    }

    void guitien(int amount){
        account_blance += amount;      
    }
    
    void ruttien(int amount){
        account_blance -=amount;
    }

    public static void main(String[] args){
        Account account;
        account = new Account();
        account.show(10, 20);
        account.guitien(20);
        account.show();

    }
    
}

package haitnn2008110232.Lab3;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập một số: ");
        int n = scanner.nextInt();
        
        boolean ok = true;
        for(int i=2; i<n-1; i++){
            if(n%i==0){
                ok = false;
                break;
            }
        i++;
        }
        if(ok)
            System.out.println(n+"Là số nguyên tố!!");
            else
            System.out.println(n+"Không phải là số nguyên tố!!");
    }
}

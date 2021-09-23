
import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Họ và tên: ");
        String hoten = scanner.nextLine();

        System.out.print("Điểm số: ");
        Double diem = scanner.nextDouble();

        System.out.println("=====================");

        System.out.printf("%s: %.1f điểm", hoten, diem);
    }
}

   
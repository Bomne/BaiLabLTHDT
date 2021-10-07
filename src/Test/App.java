package Test;
import java.util.Scanner;
class App
{
    public static void main(String args[])
    {
        int num;
        float fnum;
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        str = in.nextLine();
        System.out.println("Chuỗi vừa nhập là: "+str);
        System.out.println("Nhập vào một số nguyên: ");
        num = in.nextInt();
        System.out.println("Số nguyên vừa nhập là: "+num);
        System.out.println("Nhập vào một số thực: ");
        fnum = in.nextFloat();
        System.out.println("Số thực vừa nhập là: "+fnum);
    }
}
package com.haitnn2008110232.tuan5;

public class Test {
    public static void main(String[] args) {
        Book sach = new Book();
        sach.nhapThongTinSach();
        sach.xuatThongTinSach();
        System.out.println("==========================================================");
        NhanVien nhanVien1 = new NhanVien();
        nhanVien1.nhapThongTinNhanVien();
        nhanVien1.xuatThongTinNhanVien();
        System.out.println("==========================================================");
        Car xeMoi = new Car("Bomne","Ferari","Sieu xe",true,1000);
        xeMoi.inThongTinXe();
        System.out.println("==========================================================");
        Computer mayTinhMoi = new Computer("Asus", "Window","i9-12900KF",2021,32,2021,100000000);
        mayTinhMoi.inThongTinMayTinh();
        System.out.println("==========================================================");
        Account taiKhoanMoi = new Account("Bomne", 2008110232, 10000);
        taiKhoanMoi.deposite(200000);
        taiKhoanMoi.Withdraw(20000);
        taiKhoanMoi.Show_Balance();
        System.out.println("==========================================================");
        Cow boCon = new Cow(2, 15);
        boCon.keu();
        boCon.an();
        System.out.println("==========================================================");
    }
}

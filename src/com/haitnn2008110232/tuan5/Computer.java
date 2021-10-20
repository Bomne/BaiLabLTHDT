package com.haitnn2008110232.tuan5;

public class Computer {
    String nhaSanXuat,heDieuHanh,CPU;
        long gia;
        int namSanXuat,ram,namBaoHanh;
        Computer(String nhSX , String hDH ,String chip ,int nSX,int r ,int nBH, long g){
            nhaSanXuat = nhSX;
            heDieuHanh = hDH;
            CPU = chip;
            namSanXuat = nSX;
            ram = r;
            namBaoHanh = nBH;
            gia = g ;
        }
        void inThongTinMayTinh(){
            System.out.println("Nhà sản xuất : " + nhaSanXuat);
            System.out.println("Năm sản xuất : " + namSanXuat);
            System.out.println("Hệ điều hành : " + heDieuHanh);
            System.out.println("Ram : " + ram + " GB");
            System.out.println("CPU : " + CPU);
            System.out.println("Giá : " + gia);
            System.out.println("Năm bảo hành : " + namBaoHanh);
        }
}

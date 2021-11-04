package com.kiemtragiuaki;

public class QuanLyTestDrive {
    public static void main(String[] args){
        DanhSachQuanLy ds = new DanhSachQuanLy();
        HocVien sv = new HocVien();
        sv.setDiemMonHoc1(5);
        sv.setDiemMonHoc2(6);
        sv.setHoTen("Tran Nguyen Ngoc Hai");
        sv.setDiaChi("Kim Hai, Kim Dinh, Tp Ba Ria");
        sv.setSoLuongHV(10);
        ds.them(sv);
        NhanVien nv = new NhanVien();
        nv.setHeSoLuong(5);
        nv.setHoTen("Nguyen Ngoc Hai");
        nv.setDiaChi("To 8, Kim Hai, Kim Dinh, Thanh Pho Ba Ria, BRVT");
        ds.them(nv);
        KhacHang kh = new KhacHang();
        kh.setTenCongTy("DH Gia Dinh");
        kh.setTriGiaDonHang(200000);
        kh.setHoTen("Ngoc Hai");
        kh.setDiaChi("Hem 325 Phan Van Tri, Kim Hai, Kim Dinh, Thanh Pho Ba Ria, BRVT");
        ds.them(kh);
        ds.inDanhSach();
    }
}

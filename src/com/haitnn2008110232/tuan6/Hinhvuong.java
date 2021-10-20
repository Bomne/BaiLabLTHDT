package com.haitnn2008110232.tuan6;

public class Hinhvuong {
    String amthanh = "Ting ting ting";
    Boolean click = false;
    Hinhvuong(Boolean c){
        click = c;
    }
    void Xoay(){
        if(click == true)
            System.out.println("Xoay hình vuông 360 độ !!! ");
    }
    void PhatRaAmThanh(){
        if(click == true)
            System.out.println("Phát ra âm thanh : " + amthanh + " !!! ");
    }
}

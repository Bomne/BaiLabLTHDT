package com.haitnn2008110232.tuan6;

public class Tamgiac {
    String amthanh = "Ting ting ting";
    Boolean click = false;
    Tamgiac(Boolean c){
        click = c;
    }
    void Xoay(){
        if(click == true)
            System.out.println("Xoay hình tam giác 360 độ : ");
    }
    void PhatRaAmThanh(){
        if(click == true)
            System.out.println("Phát ra âm thanh : " + amthanh +" !!! " );
    }
}

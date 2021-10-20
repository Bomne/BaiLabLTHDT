package com.haitnn2008110232.tuan6;

public class Hinhtron {
    String amthanh = "Ting ting";
    Boolean click = false;
    Hinhtron(Boolean c){
        click = c;
    }
    void xoay(){
        if(click == true)
            System.out.println("Xoay hình tròn 360 độ.");
    }
    void PhatRaAmThanh(){
        if(click == true)
            System.out.println("Phát ra âm thanh: "+amthanh+"!!!");
    }
}

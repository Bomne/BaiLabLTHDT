package com.haitnn2008110232.tuan7.xoayhinh;

public class Hinhvuong extends Hinhhoc {
    protected String sound = "Hinhvuong.hif";
    protected Boolean click ;
    Hinhvuong(Boolean c){
        click = c;
    }
    protected String makeNoise(){
        System.out.println("Phat ra am thanh: "+ sound);
        return sound;
    }
    protected void dientich(){
        System.out.println("S = cd * cr");
    }
    private void click(){
        if(click == true){
            Xoay();
            makeNoise();
            dientich();
        }else System.out.println("Ban chua click !!!");
        
    }
    public void getClick(){
        click();       
    }
}

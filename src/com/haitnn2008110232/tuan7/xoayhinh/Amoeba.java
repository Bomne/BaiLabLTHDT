package com.haitnn2008110232.tuan7.xoayhinh;

public class Amoeba extends Hinhhoc{
    String sound = "Amoeba.aif";
    Boolean click = true;
    int x;
    int y;
    Amoeba(int xx , int yy,Boolean c){
        x=xx;
        y=yy;
        click = c;
    }
    Amoeba(){
        
    }
    protected String Xoay(){
            System.out.println("Xoay hinh Amoeba theo toa do x = " + x + " và y = " + y );
            return sound;
    }
    protected String makeNoise(){
            System.out.println("Phat ra am thanh : " + sound);
            return sound;
    }
    private void click(){
        if(click == true){
            Xoay();
            makeNoise();
        }
        else System.out.println("Ban chua click !!!");
        
    }
    public void getClick(){
        click();       
    }
}

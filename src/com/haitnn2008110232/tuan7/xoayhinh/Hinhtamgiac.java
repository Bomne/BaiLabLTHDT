package com.haitnn2008110232.tuan7.xoayhinh;

public class Hinhtamgiac extends Hinhhoc{
    protected String sound = "Hinhtamgiac.hif";
    protected Boolean click;
    Hinhtamgiac(Boolean c){
        click = c;
    }
    protected String makeNoise(){
        System.out.println("Phat ra am thanh: "+sound);
        return sound;
    }
    protected void dientich(){
        System.out.println("S = (1/2)a * h");
    }
    private void click(){
        if(click == true){
            Xoay();
            makeNoise();
            dientich();
        }else System.out.println("Ban chua click!!!");
    }
    public void getClick(){
        click();
    }
}

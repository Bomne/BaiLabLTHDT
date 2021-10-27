package com.haitnn2008110232.tuan7.xoayhinh;

public class Hinhtron extends Hinhhoc{
    protected String sound = "Hinhtron.hif";
    protected Boolean click;
    Hinhtron(Boolean c){
        click = c;
    }
    protected String makeNoise(){
        System.out.println("Phat ra am thanh: "+sound);
        return sound;
    }
    protected void dientich(){
        System.out.println("S = pi * r^2");
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

package test;

public class Hinhtron {
    String amthanh = "Hinhtron.hif";
    boolean click = false;
    int x;
    int y;

    void click(){
        click = !click;
    }
    Hinhtron(String string, int i, int j){}

    public Hinhtron(String s){
        amthanh = s;
    }

    void rotate(){
        if(click == true){
            System.out.println("Xoay quanh 360 độ x = "+x+"y = "+y);
        }
    }

    void playamthanh(){
        if(click == true){
            System.out.println("phat ra file am thanh co ten: "+amthanh);   
        }
       
    }
    Hinhtron(int xx, int yy){
        x=xx;
        y=yy;
    }
}

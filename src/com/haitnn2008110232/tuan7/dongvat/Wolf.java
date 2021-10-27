package com.haitnn2008110232.tuan7.dongvat;

public class Wolf extends Rangnanh{
    String food = "Meat....";
    protected void makeNoise(){
        System.out.println("Wooooo....Wooooo...");
    }
    protected void eat(){
        System.out.println("thuc an: "+food);
    }
}

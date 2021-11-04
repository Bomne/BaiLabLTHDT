package com.haitnn2008110232.tuan7.animal;

public class Wolf extends Rangnanh{
    String food = "Meat....Meat....";
    protected void makeNoise(){
        System.out.println("Wooooo......Woooo....");
    }
    protected void eat(){
        System.out.println("Thức ăn: " + food);
    }
}

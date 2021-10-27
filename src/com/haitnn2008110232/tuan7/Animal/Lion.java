package com.haitnn2008110232.tuan7.Animal;

public class Lion extends Homeo{
    String food = "Meat...";
    protected void makeNoise(){
        System.out.println("Waoooo...Waoooo....");
    }
    protected void eat(){
        System.out.println("Thức ăn: " + food);
    }
}

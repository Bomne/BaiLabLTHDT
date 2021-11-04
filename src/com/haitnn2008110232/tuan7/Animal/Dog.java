package com.haitnn2008110232.tuan7.animal;

public class Dog extends Rangnanh{
    String food = "Dog food";
    protected void makeNoise(){
        System.out.println("Gâu gâu");
    }
    protected void eat(){
        System.out.println("Thức ăn: " + food);
    }
}

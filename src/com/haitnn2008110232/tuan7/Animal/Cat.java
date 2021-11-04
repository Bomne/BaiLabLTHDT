package com.haitnn2008110232.tuan7.animal;

public class Cat extends Homeo{
    String food = "Cat food";
    protected void makeNoise(){
        System.out.println("Meow...meowww....");
    }
    protected void eat(){
        System.out.println("Thức ăn: " + food);
    }
}

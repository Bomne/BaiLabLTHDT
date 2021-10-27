package com.haitnn2008110232.tuan7.dongvat;

public class Cat extends Homeo{
    String food = "Cat food...";
    protected void makeNoise(){
        System.out.println("Meow...Meowww...");
    }
    protected void eat(){
        System.out.println("Thuc an: "+food);
    }
    
}

package com.haitnn2008110232.tuan7.dongvat;

public class Dog extends Rangnanh{
    String food = "Dog food";
    protected void makeNoise(){
        System.out.println("Gau...Gauu...");
    }
    protected void eat(){
        System.out.println("Thuc an: " + food);
    }
}

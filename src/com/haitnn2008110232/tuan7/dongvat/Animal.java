package com.haitnn2008110232.tuan7.dongvat;

public class Animal {
    protected String picture;
    protected int age;
    protected String food;
    protected int hunger;
    protected float boundaries;
    protected String sound; 
    protected void eat(){
        System.out.println("Thuc an: "+ food);
    }
    protected void roam(){
        System.out.println("Walking...");
    }
    protected void makeNoise(){
        System.out.println("Sound...");
    }
    protected void findFood(){
        System.out.println("Di tim thuc an");
    }
    protected void Sleep(){
        System.out.println("Zzz...Zzz...");
    }
}

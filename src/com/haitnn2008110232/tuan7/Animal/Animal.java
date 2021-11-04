package com.haitnn2008110232.tuan7.animal;

public class Animal {
    protected String picture;
    protected int age;
    protected String food;
    protected int hunger;
    protected float boundaries;
    protected String sound; 
    protected void eat(){
        System.out.println("Thức ăn: "+ food);
    }
    protected void roam(){
        System.out.println("Walking....");
    }
    protected void makeNoise(){
        System.out.println("Tiếng kêu");
    }
    protected void findFood(){
        System.out.println("Nhăm...Nhăm....");
    }
    protected void Sleep(){
        System.out.println("Zzz...Zzzz....");
    }
}

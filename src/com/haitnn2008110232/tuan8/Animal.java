package com.haitnn2008110232.tuan8;

public class Animal {
    private String picture;
    private int age;
    private String food;
    private int hunger;
    private float boundaries;
    private String sound; 
    private String name;
    protected void eat(){
        System.out.println("Ăn thức ăn : "+ food);
    }
    protected void roam(){
        System.out.println("===đi bộ===");
    }
    protected void makeNoise(){
        System.out.println("tiếng động vật kêu !!!");
    }
    protected void findFood(){
        System.out.println("đi tìm thức ăn :v");
    }
    protected void Sleep(){
        System.out.println("zzzZZZZzzzzzzzzzz");
    }
    public Animal(){
        System.out.println("create a animal");
    }
    public Animal(String n) {
        name = n;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}

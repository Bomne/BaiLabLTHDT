package com.haitnn2008110232.tuan7.dongvat;
import java.util.Scanner;
public class testdrive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int luachon;
        do{
            System.out.println("==========ANIMAL==========");
            System.out.println("1. Động vật có răng nanh");
            System.out.println("2. Động vật họ mèo");
            System.out.println("anyNumber. Kết thúc!!!");
            System.out.println("==========================");
            System.out.print("Nhập lựa chọn: ");
            luachon = sc.nextInt();
            switch(luachon){
                case 1:
                int luachon1;
                do{
                    System.out.println("==========Canine==========");
                    System.out.println("1. Dog");
                    System.out.println("2. Woft");
                    System.out.println("anyNumber. Kết thúc!!!");
                    System.out.println("==========================");
                    System.out.print("Nhập lựa chọn: ");
                    luachon1 = sc.nextInt();
                    switch(luachon1){
                        case 1: 
                        Dog dog = new Dog();
                        dog.makeNoise();
                        dog.eat();
                        dog.roam();
                        dog.Sleep();
                        break;
                        case 2:
                        Wolf wolf = new Wolf();
                        wolf.makeNoise();
                        wolf.eat();
                        wolf.roam();
                        wolf.Sleep();
                        break;

                    }
                }while(luachon1 <= 2 && luachon1 > 0);
                break;
            case 2:
            int luachon2;
            do{
                System.out.println("==========Canine==========");
                System.out.println("1. Cat");
                System.out.println("2. Lion");
                System.out.println("anyNumber. Kết thúc!!!");
                System.out.println("==========================");
                System.out.print("Nhập lựa chọn: ");
                luachon2 = sc.nextInt();
                switch(luachon2){
                    case 1:
                    Cat cat = new Cat();
                    cat.makeNoise();
                    cat.eat();
                    cat.roam();
                    cat.Sleep();
                    break;
                    case 2:
                    Lion lion = new Lion();
                    lion.makeNoise();
                    lion.eat();
                    lion.roam();
                    lion.Sleep();
                    break;
                }
            }while(luachon2 <=2 && luachon2 > 0);
            }   
        }while(luachon <= 2 && luachon > 0);
        
    }
    
}

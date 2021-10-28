package com.haitnn2008110232.tuan7.Animal;
import java.util.Scanner;
public class TestDrive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int luachon;
        do{
        System.out.println("==========ANIMAL==========");
        System.out.println("1.Động vật có răng nanh");
        System.out.println("2.Động vật họ mèo");       
        System.out.println("anyNumber.Kết thúc!!");
        System.out.println("==========================");
        System.out.print("Chọn chức năng: ");
        luachon = sc.nextInt();
        switch(luachon){
            case 1:
            int luachon1;
            do{
                System.out.println("==========CANINE==========");
                System.out.println("1.DOG");
                System.out.println("2.WOFL");
                System.out.println("==========================");
                System.out.print("Chọn chức năng: ");
                luachon1 = sc.nextInt();
                switch(luachon1){
                    case 1: 
                    Dog dog = new Dog();
                    dog.eat();
                    dog.makeNoise();
                    dog.roam();
                    dog.Sleep();
                    break;
                    case 2:
                    Wolf wolf = new Wolf();
                    wolf.eat();
                    wolf.makeNoise();
                    wolf.roam();
                    wolf.Sleep();
                    break;
                }


            }while(luachon1 <=2 && luachon1 > 0);
            break;
            case 2:
            int luachon2;
            do{
                System.out.println("==========FELINE==========");
                System.out.println("1.CAT");
                System.out.println("2.LION");
                System.out.println("==========================");
                System.out.print("Chọn chức năng: ");
                luachon2 = sc.nextInt();
                switch(luachon2){
                    case 1: 
                    Cat cat = new Cat();
                    cat.eat();
                    cat.makeNoise();
                    cat.roam();
                    cat.Sleep();
                    break;
                    case 2:
                    Lion lion = new Lion();
                    lion.eat();
                    lion.makeNoise();
                    lion.roam();
                    lion.Sleep();
                    break;
                }


            }while(luachon2 <=2 && luachon2 > 0);
            break;
        }
    }while(luachon <=2 && luachon > 0);
    
}
}

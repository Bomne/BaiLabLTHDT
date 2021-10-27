package test;

public class Animal {
    private String sound;
    private String picture;
    private String food;
    private int hunger;
    private String boundaries;
    private int location;

   protected void makeNoise(){
       System.out.println("keukeu"+sound);
   }

   protected void eat(){
       System.out.println("Mam...Mam...");
   }

   protected void sleep(){
       System.out.println("ZzzZzz");
   }

   protected void roam(){
       System.out.println("Walking...");
   }
}

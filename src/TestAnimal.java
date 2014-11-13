/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STUDENT-FES-EA03029
 */
public class TestAnimal {

    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        /* System.out.println("=== Fish Fish ===");
         Fish.eat();
         d.play();
         d.walk();
         d.setName("Nemo");
         System.out.println("Moje jmeno je: " + d.getName());

         System.out.println("\n=== Cat Cat ===");
         Cat.eat();
         c.play();
         c.walk();
         c.setName("Chuck");
         System.out.println("Moje jmeno je: " + c.getName());*/
        System.out.println("\n=== Animal Fish ===");
        a.walk();
        System.out.println("=== Animal Fish === + pretypovani");
        Fish aFish = (Fish) a;
        aFish.setName("Nemo v2");

        System.out.println("Moje jmeno je: " + aFish.getName());

    }
}

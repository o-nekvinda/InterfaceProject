/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STUDENT-FES-EA03029
 */
public class Cat extends Animal implements Pet {

    private String name;

    public Cat() {
        super(0);
    }

    public Cat(String n) {
        super(4);
        this.name = n;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String n) {
        this.name = n;
    }

    @Override
    public void play() {
        System.out.println("Cat: Play");
    }

    public void eat() {
        System.out.println("Cat: Eat");
    }
}

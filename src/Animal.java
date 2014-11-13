/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STUDENT-FES-EA03029
 */
abstract public class Animal {

    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("Toto zvíøe jde po " + this.legs + " nohou.");
    }

    public void eat() {
        
    }

}

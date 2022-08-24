package model;

import model.interfaces.IAnimal;
import model.interfaces.IHunt;
import model.interfaces.IRun;
import model.interfaces.ISwim;

// Hint: missing an interface and a method implementation
public class Tiger implements ISwim, IAnimal, IHunt, IRun {

    @Override
    public void swim() {
        System.out.println("Tiger is swimming");
    }

    public void eat() {
        System.out.println("Tiger is eating");
    }

    public void sleep() {
        System.out.println("Tiger is sleeping");
    }

    public void hunt() {
        System.out.println("Tiger is hunting");
    }

    public void run() {
        System.out.println("Tiger is running");
    }

}

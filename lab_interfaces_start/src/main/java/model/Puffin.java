package model;

import model.interfaces.IAnimal;
import model.interfaces.IFly;
import model.interfaces.IPrey;


public class Puffin implements IAnimal, IFly, IPrey {
    @Override
    public void eat() {
        System.out.println("Puffin is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Puffin is eating");
    }

    @Override
    public void fly() {
        System.out.println("Puffin is flying");
    }

    @Override
    public void flee() {
        System.out.println("Puffin is fleeing from preditor");
    }
}

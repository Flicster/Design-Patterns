package com.stratagy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavour = new Squeak();
        flyBehavour = new FlyNoWay();
    }
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
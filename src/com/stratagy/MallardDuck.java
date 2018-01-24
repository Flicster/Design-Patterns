package com.stratagy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavour = new MuteQuack();
        flyBehavour = new FlyWithWings();
    }
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
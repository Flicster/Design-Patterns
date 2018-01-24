package com.stratagy;

public abstract class Duck {
    FlyBehavour flyBehavour;
    QuackBehavour quackBehavour;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavour.fly();
    }

    public void performQuack() {
        quackBehavour.quack();
    }

    public void swim() {
        System.out.println("All ducks fly even decoy");
    }

    public void setFlyBehavour(FlyBehavour fb) {
        flyBehavour = fb;
    }

    public void setQuackBehavour(QuackBehavour qb) {
        quackBehavour = qb;
    }
}
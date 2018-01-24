package com.stratagy;

public class MuteQuack implements QuackBehavour {

    public void quack() {
        System.out.println("<< Silence >>");
    }
}
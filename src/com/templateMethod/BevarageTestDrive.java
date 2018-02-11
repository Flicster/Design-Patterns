package com.templateMethod;

public class BevarageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking Tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking Coffee...");
        coffee.prepareRecipe();
    }
}

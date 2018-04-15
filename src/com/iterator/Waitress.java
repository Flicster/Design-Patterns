package com.iterator;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = (Iterator) pancakeHouseMenu.createIterator();
        Iterator dinerIterator = (Iterator) dinerMenu.createIterator();
        System.out.println("\nBreakfast");
        printMenu(pancakeIterator);
        System.out.println("\nLunch");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName());
            System.out.print(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
        }
    }
}

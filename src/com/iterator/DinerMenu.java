package com.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItem = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Test 5", "Test 5", true, 12.02);
        addItem("Test 6", "Test 6", false, 2.03);
        addItem("Test 7", "Test 7", true, 22.15);
        addItem("Test 8", "Test 8", false, 7.38);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItem >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!");
        } else {
            menuItems[numberOfItem] = menuItem;
            numberOfItem = numberOfItem + 1;
        }
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator() {
        return (Iterator) new DinerMenuIterator(menuItems);
    }
}

package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("Test 1", "Test 1", true, 12.02);
        addItem("Test 2", "Test 2", false, 2.03);
        addItem("Test 3", "Test 3", true, 22.15);
        addItem("Test 4", "Test 4", false, 7.38);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

//    public ArrayList getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator() {
//        return new PancakeHouseIterator(menuItems);
        return menuItems.iterator();

    }
}

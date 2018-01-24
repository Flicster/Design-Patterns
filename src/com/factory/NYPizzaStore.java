//package com.factory;
//
//public class NYPizzaStore extends PizzaStore {
//
//    protected Pizza createPizza(String item) {
//        Pizza pizza = null;
//        PizzaIngridientFactory ingridientFactory = new NYPizzaIngridientFactory();
//
//        if (item.equals("Cheese")){
//            pizza = new CheesePizza(ingridientFactory);
//            pizza.setName("New York style cheese pizza");
//        } else if (item.equals("Veggie")) {
//            pizza = new VeggiePizza(ingridientFactory);
//            pizza.setName("New York style Veggie pizza");
//        } else if (item.equals("Pepperoni")) {
//            pizza = new PepperoniPizza(ingridientFactory);
//            pizza.setName("New York style Pepperoni pizza");
//        } else if (item.equals("Clam")) {
//            pizza = new ClamPizza(ingridientFactory);
//            pizza.setName("New York style Clam pizza");
//        }
//
//        return pizza;
//    }
//}

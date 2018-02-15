package com.nagarro.designpatterns.factoryAndtemplate;

public abstract class AbstractPizzaStore {

    public Pizza orderPizza(final String type) {
        final Pizza pizza = createPizza(type);
        System.out.println("Recieved the order for " + pizza.getDescription());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}

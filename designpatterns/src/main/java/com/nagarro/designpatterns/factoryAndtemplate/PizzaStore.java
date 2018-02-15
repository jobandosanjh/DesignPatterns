package com.nagarro.designpatterns.factoryAndtemplate;

public final class PizzaStore {

    private final PizzaFactory factory;

    public PizzaStore(final PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(final String type) {
        final Pizza pizza = factory.createPizza(type);
        System.out.println("Recieved the order for " + pizza.getDescription());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

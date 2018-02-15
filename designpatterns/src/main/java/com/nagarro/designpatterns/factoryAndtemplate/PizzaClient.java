package com.nagarro.designpatterns.factoryAndtemplate;

import com.nagarro.designpatterns.factoryAndtemplate.NYPizzaStore.NYPizzaType;
import com.nagarro.designpatterns.factoryAndtemplate.PizzaFactory.PizzaType;

public final class PizzaClient {

    public static void main(final String[] args) {

        final PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
        pizzaStore.orderPizza(PizzaType.CHEESE.getValue());

        final AbstractPizzaStore abstractPizzaStore = new NYPizzaStore();
        abstractPizzaStore.orderPizza(NYPizzaType.CHEESE.getValue());
    }

}

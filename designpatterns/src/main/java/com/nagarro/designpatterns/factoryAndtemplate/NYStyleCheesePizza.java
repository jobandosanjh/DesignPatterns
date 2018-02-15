package com.nagarro.designpatterns.factoryAndtemplate;

public class NYStyleCheesePizza extends Pizza {

    @Override
    protected String getDescription() {
        return "New York Style Cheese Pizza";
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing pizza with New York Cheese");
    }

}

package com.nagarro.designpatterns.factoryAndtemplate;

public class NYStyleVeggiePizza extends Pizza {

    @Override
    protected String getDescription() {
        return "New York Style Veggie Pizza";
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing with New York Vegetables");
    }

}

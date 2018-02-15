package com.nagarro.designpatterns.factoryAndtemplate;

public class NYStylePepperoniPizza extends Pizza {

    @Override
    protected String getDescription() {
        return "New York Style Pepperoni Pizza";
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing With New York Pepperoni");
    }

}

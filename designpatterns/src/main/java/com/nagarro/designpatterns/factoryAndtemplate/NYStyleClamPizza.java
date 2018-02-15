package com.nagarro.designpatterns.factoryAndtemplate;

public class NYStyleClamPizza extends Pizza {

    @Override
    protected String getDescription() {
        return "New York Style Clam Pizza";
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing With New York Clam");
    }

}

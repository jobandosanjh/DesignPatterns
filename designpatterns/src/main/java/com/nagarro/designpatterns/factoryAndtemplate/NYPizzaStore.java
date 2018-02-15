package com.nagarro.designpatterns.factoryAndtemplate;

public class NYPizzaStore extends AbstractPizzaStore {

    public Pizza createPizza(final String type) {
        return NYPizzaType.valueOf(type).getPizza();
    }

    enum NYPizzaType {

        CHEESE("CHEESE") {
            @Override
            Pizza getPizza() {
                return new NYStyleCheesePizza();
            }
        },
        PEPPERONI("PEPPERONI") {
            @Override
            Pizza getPizza() {
                return new NYStylePepperoniPizza();
            }
        },
        CLAM("CLAM") {
            @Override
            Pizza getPizza() {
                return new NYStyleClamPizza();
            }
        },
        VEGGIE("VEGGIE") {
            @Override
            Pizza getPizza() {
                return new NYStyleVeggiePizza();
            }
        };

        private final String value;

        private NYPizzaType(final String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        abstract Pizza getPizza();
    }
}
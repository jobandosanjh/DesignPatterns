package com.nagarro.designpatterns.factoryAndtemplate;

public final class PizzaFactory {

    public Pizza createPizza(final String type) {
        return PizzaType.valueOf(type).getPizza();
    }

    enum PizzaType {

        CHEESE("CHEESE") {
            @Override
            Pizza getPizza() {
                return new CheesePizza();
            }
        },
        PEPPERONI("PEPPERONI") {
            @Override
            Pizza getPizza() {
                return new PepperoniPizza();
            }
        },
        CLAM("CLAM") {
            @Override
            Pizza getPizza() {
                return new ClamPizza();
            }
        },
        VEGGIE("VEGGIE") {
            @Override
            Pizza getPizza() {
                return new VeggiePizza();
            }
        };

        private final String value;

        private PizzaType(final String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        abstract Pizza getPizza();
    }
}

package com.workintech.burger;

public class DeluxBurger extends Hamburger {
    private Drink drink;
    private Chips chips;

    public DeluxBurger(String name, String meat, double price, String breadRollType ) {
        super(name, meat, price, breadRollType);
        this.drink= drink;
        this.chips= chips;
    }

}

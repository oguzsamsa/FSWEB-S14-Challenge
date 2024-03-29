package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private String drink;

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    public DeluxeBurger(String name, String meat, String breadRollType) {
        super(name, meat, 19.1, breadRollType);
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public DeluxeBurger() {
        this.cips = "CURVY";
        this.drink = "COKE";
        setPrice(19.1);
    }

    @Override
    public void addHamburgerAddition1(String additionName, double additionPrice) {
        System.out.println("Deluxe burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String additionName, double additionPrice) {
        System.out.println("Deluxe burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String additionName, double additionPrice) {
        System.out.println("Deluxe burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String additionName, double additionPrice) {
        System.out.println("Deluxe burger için yeni malzeme eklenemez.");
    }
}

package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger() {
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void addHamburgerAddition1(String additionName, double additionPrice){
        this.addition1Name = additionName;
        this.addition1Price = additionPrice;
        this.price += additionPrice;
    }

    public void addHamburgerAddition2(String additionName, double additionPrice){
        this.addition2Name = additionName;
        this.addition2Price = additionPrice;
        this.price += additionPrice;
    }

    public void addHamburgerAddition3(String additionName, double additionPrice){
        this.addition3Name = additionName;
        this.addition3Price = additionPrice;
        this.price += additionPrice;
    }

    public void addHamburgerAddition4(String additionName, double additionPrice){
        this.addition4Name = additionName;
        this.addition4Price = additionPrice;
        this.price += additionPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double itemizeHamburger() {
        System.out.println("additions: " + this.addition1Name + ", " + this.addition2Name + ", " + this.addition3Name + ", " + this.addition4Name);
        return this.price;
    }

}

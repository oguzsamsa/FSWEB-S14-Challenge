package org.example.models;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String healthyExtraName, double healthyExtraPrice){
        this.healthyExtra1Name = healthyExtraName;
        this.healthyExtra1Price = healthyExtraPrice;
        setPrice(getPrice() + healthyExtraPrice);

    }

    public void addHealthyAddition2(String healthyExtraName, double healthyExtraPrice){
        this.healthyExtra2Name = healthyExtraName;
        this.healthyExtra2Price = healthyExtraPrice;
        setPrice(getPrice() + healthyExtraPrice);
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("additions: " + this.healthyExtra1Name + ", " + this.healthyExtra2Name);
        return getPrice();
    }
}

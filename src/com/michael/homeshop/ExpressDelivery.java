package com.michael.homeshop;

public class ExpressDelivery implements Delivery {
    private String city;
    private double price;

    public ExpressDelivery(String city) {
        this.city = city;
    }

    @Override
    public double getPrice() {
        if (city.equals("Paris")) {
            price = 6.99;
            return price;
        }
        else {
            price = 9.99;
            return price;
        }
    }

    @Override
    public String getInfo() {
        return "livraison express : " + price + "€";
    }
}
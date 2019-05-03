package com.michael.homeshop;

public class RelayDelivery implements Delivery {
    private int number;
    private double price;

    public RelayDelivery(int number) {
        this.number = number;
    }

    @Override
    public double getPrice() {
        if (number >= 1 && number <= 22) {
            price = 0;
            return price;
        }
        else if (number >= 23 && number <= 47) {
            price = 2.99;
            return price;
        }
        else {
            price = 4.99;
            return price;
        }
    }

    @Override
    public String getInfo() {
        return "Livraison en point relais : " + price + "€";
    }
}
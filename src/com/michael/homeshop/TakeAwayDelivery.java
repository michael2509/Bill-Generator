package com.michael.homeshop;

public class TakeAwayDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "Livraison en magasin : 0€";
    }
}
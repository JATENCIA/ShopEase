package model;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private final double limit;
    private double balance;
    private final List<Shop> shopList;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.shopList = new ArrayList<>();
    }

    public boolean LaunchPurchase(Shop shop) {
        if (this.balance >= shop.getValue()) {
            this.balance -= shop.getValue();
            this.shopList.add(shop);
            return true;
        }
        return false;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Shop> getShopList() {
        return shopList;
    }


    @Override
    public String toString() {
        return "CreditCard{" +
                "limit=" + limit +
                ", balance=" + balance +
                ", shopList=" + shopList +
                '}';
    }
}

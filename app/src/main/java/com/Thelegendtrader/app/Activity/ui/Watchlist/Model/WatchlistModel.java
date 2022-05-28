package com.Thelegendtrader.app.Activity.ui.Watchlist.Model;

public class WatchlistModel {
    String issueer;
    Double price,couponRate;

    public WatchlistModel(String issueer, Double price, Double couponRate) {
        this.issueer = issueer;
        this.price = price;
        this.couponRate = couponRate;
    }

    public String getIssueer() {
        return issueer;
    }

    public Double getPrice() {
        return price;
    }

    public Double getCouponRate() {
        return couponRate;
    }
}

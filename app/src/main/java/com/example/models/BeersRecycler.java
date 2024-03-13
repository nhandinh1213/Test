package com.example.models;

public class BeersRecycler {
    int productImg;
    String beerInfo;

    public BeersRecycler(int productImg, String beerInfo) {
        this.productImg = productImg;
        this.beerInfo = beerInfo;
    }

    public int getProductImg() {
        return productImg;
    }

    public void setProductImg(int productImg) {
        this.productImg = productImg;
    }

    public String getBeerInfo() {
        return beerInfo;
    }

    public void setBeerInfo(String beerInfo) {
        this.beerInfo = beerInfo;
    }
}

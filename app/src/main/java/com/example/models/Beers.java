package com.example.models;

public class Beers {
    int productThumb;
    String beerName;

    public Beers(int productThumb, String beerName) {
        this.productThumb = productThumb;
        this.beerName = beerName;
    }

    public  int getProductThumb() {
        return productThumb;
    }

    public void setProductThumb(int productThumb) {
        this.productThumb = productThumb;
    }

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }
}





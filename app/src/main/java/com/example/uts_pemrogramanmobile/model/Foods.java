package com.example.uts_pemrogramanmobile.model;

import java.io.Serializable;

public class Foods implements Serializable {
    String namaFood, priceFood, detailFood, sizeFood;
    int gambarFood;

    public Foods(String namaFood, String priceFood, String detailFood, String size, int gambarFood) {
        this.namaFood = namaFood;
        this.priceFood = priceFood;
        this.detailFood = detailFood;
        this.sizeFood = size;
        this.gambarFood = gambarFood;
    }

    public String getNamaFood() {
        return namaFood;
    }

    public String getPriceFood() {
        return priceFood;
    }

    public String getDetailFood() {
        return detailFood;
    }

    public String getSize() {
        return sizeFood;
    }

    public int getGambarFood() {
        return gambarFood;
    }
}

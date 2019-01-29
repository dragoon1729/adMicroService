package com.adservice.adMicroService.dto;

public class AdvertisementDTO {

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    private String category;
    private String adUrl;

    @Override
    public String toString() {
        return "AdvertisementDTO{" +
                "category='" + category + '\'' +
                ", adUrl='" + adUrl + '\'' +
                '}';
    }
}

package com.adservice.adMicroService.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADVERTISEMENT")
public class Advertisement {
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

    @Id
    private String category;
    private String adUrl;

    @Override
    public String toString() {
        return "AdvertisementService{" +
                "category='" + category + '\'' +
                ", adUrl='" + adUrl + '\'' +
                '}';
    }
}

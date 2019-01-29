package com.adservice.adMicroService.Service;

import com.adservice.adMicroService.entity.Advertisement;

public interface AdvertisementService {

    Advertisement select(String category);
    Advertisement add(Advertisement advertisement);
    void delete(String category);
    Advertisement getAd(String userId);
}

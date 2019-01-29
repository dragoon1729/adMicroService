package com.adservice.adMicroService.Service;

import com.adservice.adMicroService.entity.Advertisement;
import com.adservice.adMicroService.repository.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true,propagation = Propagation.REQUIRES_NEW)
public class AdvertisementServiceImpl implements AdvertisementService{

    @Autowired
    AdvertisementRepository advertisementRepository;
    @Override
    public Advertisement select(String category) {
        return advertisementRepository.findOne(category);
    }

    @Override
    @Transactional(readOnly = false)
    public Advertisement add(Advertisement advertisement) {
        return advertisementRepository.save(advertisement);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String category) {
        advertisementRepository.delete(category);
    }

    @Override
    public Advertisement getAd(String userId) {
        return null;
    }
}

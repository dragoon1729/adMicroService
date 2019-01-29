package com.adservice.adMicroService.repository;

import com.adservice.adMicroService.entity.Advertisement;
import org.springframework.data.repository.CrudRepository;

public interface AdvertisementRepository extends CrudRepository<Advertisement,String> {
}

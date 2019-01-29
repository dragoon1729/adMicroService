package com.adservice.adMicroService.controller;

import com.adservice.adMicroService.Service.AdvertisementService;
import com.adservice.adMicroService.dto.AdvertisementDTO;
import com.adservice.adMicroService.entity.Advertisement;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/AdvertisementService")
public class AdvertisementController {

    @Autowired
    AdvertisementService advertisementService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public AdvertisementDTO get(@RequestParam("category") String category) {
        AdvertisementDTO advertisementDTO=new AdvertisementDTO();
        BeanUtils.copyProperties(advertisementService.select(category),advertisementDTO);
        return advertisementDTO;
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public AdvertisementDTO add(@RequestBody AdvertisementDTO advertisementDTO) {

        Advertisement advertisement=new Advertisement();
        BeanUtils.copyProperties(advertisementDTO,advertisement);
        AdvertisementDTO createdAdvertisementDTO=new AdvertisementDTO();
        BeanUtils.copyProperties(advertisementService.add(advertisement),createdAdvertisementDTO);
        return createdAdvertisementDTO;
    }
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public void delete(@RequestParam("category") String category) {
        advertisementService.delete(category);
    }
    @RequestMapping(value = "getAd",method = RequestMethod.GET)
    public AdvertisementDTO getAd(@RequestParam("userId") String userId) {
        AdvertisementDTO advertisementDTO=new AdvertisementDTO();
        BeanUtils.copyProperties(advertisementService.getAd(userId),advertisementDTO);
        return advertisementDTO;
    }
}

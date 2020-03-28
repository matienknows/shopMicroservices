package com.example.shop.service;

import com.example.shop.entity.Shop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public interface ShopServiceProxy {

    @GetMapping("/article/id/{id}")
    public Shop retrieveArticle(@PathVariable ("id") int id);
}

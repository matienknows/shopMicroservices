package com.example.shop.shopservice.service;

import com.example.shop.shopservice.entity.Shop;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="article-service", url="localhost:8000")
public interface ShopServiceProxy {
    @GetMapping("/article/id/{id}")
    public Shop retrieveArticle(@PathVariable("id") int id);
}


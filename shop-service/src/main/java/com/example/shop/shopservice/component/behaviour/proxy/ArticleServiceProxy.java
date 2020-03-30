package com.example.shop.shopservice.component.behaviour.proxy;

import com.example.shop.shopservice.component.structure.Shop;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="article-service")
public interface ArticleServiceProxy {
    @GetMapping("/article/id/{id}")
    public Shop retrieveArticle(@PathVariable("id") int id);
}


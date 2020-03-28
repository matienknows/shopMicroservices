package com.example.shop.shopservice.controller;

import com.example.shop.shopservice.entity.Shop;
import com.example.shop.shopservice.service.ShopServiceProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ShopController {
    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ShopServiceProxy shopServiceProxy;

    @GetMapping("article-feign/id/{id}")
    public Shop getShopArticleFeign(@PathVariable int id){

        /*int uriVariable = id;
        ResponseEntity<Shop> responseEntity = new RestTemplate().getForEntity(
                "http://localhost:8000/article/id/{id}", Shop.class, uriVariable);

        Shop response = responseEntity.getBody();
*/

        Shop response = shopServiceProxy.retrieveArticle(id);

        logger.info("{}", response);

        return new Shop(response.getArticleid(), response.getArticleName(), response.getPrice(), response.getPort());

    }

}

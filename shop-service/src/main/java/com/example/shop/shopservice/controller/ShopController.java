package com.example.shop.shopservice.controller;

import com.example.shop.shopservice.entity.Shop;
import com.example.shop.shopservice.service.CustomerServiceProxy;
import com.example.shop.shopservice.service.OrderServiceProxy;
import com.example.shop.shopservice.service.ArticleServiceProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ArticleServiceProxy articleServiceProxy;

    @Autowired
    private CustomerServiceProxy customerServiceProxy;

    @Autowired
    private OrderServiceProxy orderServiceProxy;

    @GetMapping("article/id/{id}")
    public Shop getShopArticleFeign(@PathVariable int id){

        /*int uriVariable = id;
        ResponseEntity<Shop> responseEntity = new RestTemplate().getForEntity(
                "http://localhost:8000/article/id/{id}", Shop.class, uriVariable);

        Shop response = responseEntity.getBody();
*/

        Shop response = articleServiceProxy.retrieveArticle(id);

        logger.info("{}", response);

        return new Shop(response.getArticleid(), response.getArticleName(), response.getPrice(), response.getPort());

    }

    @GetMapping("customer/customerid/{id}")
    public Shop getShopCustomerFeign(@PathVariable int id){

        Shop response = customerServiceProxy.retrieveCustomer(id);

        logger.info("{}", response);

        return new Shop(response.getCustomerId(), response.getFirstName(), response.getLastName());

    }

    @GetMapping("order_ms/order_id/{id}")
    public Shop getShopOrderFeign(@PathVariable int id){

        Shop response = orderServiceProxy.retrieveOrder(id);

        logger.info("{}", response);

        return new Shop(response.getOrderId(), response.getCustomerId());

    }

}

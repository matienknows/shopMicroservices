package com.example.article.controller;

import com.example.article.entity.Article;
import com.example.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private Environment environment;

    @Autowired
    private ArticleService articleService;

    @GetMapping(value="/id/{id}")
    public Article retrieveArticle(@PathVariable int id){

        Article article = articleService.getArticleById(id);

        article.setPort(Integer.parseInt(environment.getProperty("local.server.port")));

        return article;
    }

    @GetMapping
    public List<Article> getArticleList(){
        return articleService.getArticleList();
    }

    @PostMapping
    public void addArticle(@RequestBody Article article){
        articleService.addArticle(article);
    }


}

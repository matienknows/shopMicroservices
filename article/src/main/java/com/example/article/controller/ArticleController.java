package com.example.article.controller;

import com.example.article.entity.Article;
import com.example.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping
    public List<Article> getArticleList(){
        return articleService.getArticleList();
    }

    @PostMapping
    public void addArticle(@RequestBody Article article){
        articleService.addArticle(article);
    }


}

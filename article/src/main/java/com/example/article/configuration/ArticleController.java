package com.example.article.configuration;

import com.example.article.component.structure.Article;
import com.example.article.component.behaviour.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

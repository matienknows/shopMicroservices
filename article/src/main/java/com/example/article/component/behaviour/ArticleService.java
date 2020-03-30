package com.example.article.component.behaviour;


import com.example.article.component.structure.Article;
import com.example.article.configuration.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;


    public List<Article> getArticleList(){
        return articleRepository.findAll();

    }

    public Article getArticleById(int id){
        return articleRepository.findById(id).get();
    }


    public void addArticle(Article article){
        articleRepository.save(article);

    }

}

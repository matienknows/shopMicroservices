package com.example.article.service;


import com.example.article.entity.Article;
import com.example.article.repo.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public Optional<Article> getArticlebyId(int id){
        return articleRepository.findById(id);
    }

    public List<Article> getArticleList(){
        return articleRepository.findAll();

    }

    public void addArticle(Article article){
        articleRepository.save(article);

    }

}

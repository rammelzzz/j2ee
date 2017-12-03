package cn.j2ee.service;

import cn.j2ee.entity.Article;

import java.util.List;

/**
 * Created by rammel on 2017/12/3.
 */
public interface IArticleService {


    public void addArticle(Article article);

    public List<Article> listArticles();
}

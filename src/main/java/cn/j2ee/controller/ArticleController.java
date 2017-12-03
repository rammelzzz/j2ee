package cn.j2ee.controller;

import cn.j2ee.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rammel on 2017/12/3.
 */
@Controller
@RequestMapping
public class ArticleController {



    public String addArticle(Article article) {
        return null;
    }

}

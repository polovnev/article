package com.article.web;


import com.article.facade.ArticleFacade;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by polovnev on 03.01.18.
 */
@Controller
public class ArticleController {
    
    @Autowired
    private ArticleFacade articleFacade;
    
    @ResponseBody
    @RequestMapping("/article/{id}")
    public String getArticleById(@PathVariable("id") long id) {
       return new Gson().toJson(articleFacade.getArticle(id));
    }
}

package com.article.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by polovnev on 03.01.18.
 */
@Controller
public class UserController {
    
    @RequestMapping("/")
    public String getMainPage() {
        return "index.html";
    }
}

package com.article.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by polovnev on 10.05.18.
 */
@Controller
public class MainController {
    
    @RequestMapping("/")
    public String getMainPage() {
        return "index.html";
    }
}

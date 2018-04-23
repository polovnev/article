package com.article.web;

import com.article.model.User;
import com.article.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by polovnev on 03.01.18.
 */
@Controller
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("/")
    public String getMainPage() {
        return "index.html";
    }
    
    @ResponseBody
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") long id) {
        return userService.getUser(id);
    }
}

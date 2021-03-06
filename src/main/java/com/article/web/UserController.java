package com.article.web;

import com.article.facade.UserFacade;
import com.google.gson.Gson;
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
    private UserFacade userFacade;
    
    @ResponseBody
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable("id") long id) {
        return new Gson().toJson(userFacade.getUser(id));
        
    }
}

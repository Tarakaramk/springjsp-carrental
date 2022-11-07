package com.carrental.springjspcarrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value = "/login", method= RequestMethod.GET)
    public String loginPage(){
        return "login";
    }
    @RequestMapping(value = "/login", method= RequestMethod.POST)
    public String welcomePage(ModelMap model, @RequestParam String userId, @RequestParam String password) {
        if (userId.equals("admin") && password.equals("root")) {
            return "welcome";
        }
        model.put("error","please provide the correct userid and password");
        return "login";
    }
}
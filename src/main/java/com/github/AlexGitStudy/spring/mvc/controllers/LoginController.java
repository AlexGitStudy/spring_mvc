package com.github.AlexGitStudy.spring.mvc.controllers;

import com.github.AlexGitStudy.spring.mvc.object.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    private static final Logger logger = Logger.getLogger(LoginController.class);

    @GetMapping(value = "/")
    public ModelAndView index() {
        return new ModelAndView("login", "user", new User());
    }


    @PostMapping(value = "/check-user")
    public ModelAndView checkUser(@ModelAttribute("user") User user) {

        // Второй вариант наполняем ModelAndViev через геттеры и сеттеры
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index");
//        modelAndView.addObject("user",user);

        return new ModelAndView("index", "user", user);

    }

    @GetMapping(value = "/failed")
    public ModelAndView failed() {

        return new ModelAndView("login-failed", "massage", "Login failed");

    }

}

package com.github.AlexGitStudy.spring.mvc.controllers;

import com.github.AlexGitStudy.spring.mvc.object.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class LoginController {
    private static final Logger logger = Logger.getLogger(LoginController.class);

    @GetMapping(value = "/")
    public ModelAndView index() {
        return new ModelAndView("login", "user", new User());
    }


    @PostMapping(value = "/check-user")
    public String checkUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {

        // Второй вариант наполняем ModelAndViev через геттеры и сеттеры
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index");
//        modelAndView.addObject("user",user);
        if (bindingResult.hasErrors()) {return "login";}

        model.addAttribute("user", user);
        return "index";

    }

    @GetMapping(value = "/failed")
    public ModelAndView failed() {

        return new ModelAndView("login-failed", "massage", "Login failed");

    }

}

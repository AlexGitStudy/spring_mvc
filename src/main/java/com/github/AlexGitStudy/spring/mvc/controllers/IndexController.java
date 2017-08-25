package com.github.AlexGitStudy.spring.mvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.Date;


/**
 * Created by saurabh on 2/10/17.
 */

@Controller
public class IndexController {

    private static final Logger LOGGER= Logger.getLogger(IndexController.class);

    @GetMapping("/")
    public String index(Model m) {
        LOGGER.info("test logger");
        Date date = new Date();
        m.addAttribute("today", date);
        m.addAttribute("someAttribute", "someValue5");
        return "index";
    }
}

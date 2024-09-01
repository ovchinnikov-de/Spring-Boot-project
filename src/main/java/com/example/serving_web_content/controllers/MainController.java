package com.example.serving_web_content.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String main(Model model) {
        /*
        model.addAttribute("name", "Главная страница");
        model.addAttribute("title", "Главная");*/
        return "main";
    }

    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }

}
package com.example.serving_web_content.controllers;

import com.example.serving_web_content.models.Pizza;
import com.example.serving_web_content.reposytory.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private PizzaRepository pizzaRepository;
    @GetMapping("/")
    public String main(Model model) {
        Iterable<Pizza> pizzas = pizzaRepository.findAll();
        model.addAttribute("pizzas", pizzas);
        return "main";
    }



    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }

}
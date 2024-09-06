package com.example.serving_web_content.controllers;

import com.example.serving_web_content.models.Pizza;
import com.example.serving_web_content.models.Salad;
import com.example.serving_web_content.reposytory.PizzaRepository;
import com.example.serving_web_content.reposytory.SaladRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private SaladRepository saladRepository;
    @GetMapping("/")
    public String main(Model model) {
        Iterable<Pizza> pizzas = pizzaRepository.findAll();
        Iterable<Salad> salads = saladRepository.findAll();
        model.addAttribute("pizzas", pizzas);
        model.addAttribute("salads", salads);
        return "main";
    }



    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }

}
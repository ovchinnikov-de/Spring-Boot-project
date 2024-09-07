package com.example.serving_web_content.controllers;

import com.example.serving_web_content.models.Booking;
import com.example.serving_web_content.models.Pizza;
import com.example.serving_web_content.models.Salad;
import com.example.serving_web_content.reposytory.BookingRepository;
import com.example.serving_web_content.reposytory.PizzaRepository;
import com.example.serving_web_content.reposytory.SaladRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private SaladRepository saladRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping("/")
    public String main(Model model) {
        Iterable<Pizza> pizzas = pizzaRepository.findAll();
        Iterable<Salad> salads = saladRepository.findAll();
        model.addAttribute("pizzas", pizzas);
        model.addAttribute("salads", salads);
        return "main";
    }

    @PostMapping("/")
    public ModelAndView booking(@Valid @ModelAttribute Booking booking,BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()) {
            // Верните форму с ошибками
            model.addAttribute("errors", bindingResult.getAllErrors());
            return new ModelAndView("main");
        }

        bookingRepository.save(booking);
        return new ModelAndView("main");


    }


    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }

}
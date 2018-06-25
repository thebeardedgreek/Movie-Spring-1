package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/movieform")
    public String loadFormPage(Model model){
        model.addAttribute("movie", new Movie());
        return "movieform";
    }

    @PostMapping("/movieform")
    public String loadFromPage(@ModelAttribute Movie movie, Model model){
        model.addAttribute("movie", movie);
        return "confirmmovie";
    }
}

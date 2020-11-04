package com.CourseraMinimalka.Controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String Main( Model model) {
        return "home";
    }
    @GetMapping("/about")
    public String about( Model model) {
        return "about";
    }

}
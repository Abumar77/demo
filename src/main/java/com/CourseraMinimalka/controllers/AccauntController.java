package com.CourseraMinimalka.controllers;

import com.CourseraMinimalka.Entity.student;
import com.CourseraMinimalka.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccauntController {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/login")
     public String Login(Model model){
        Iterable<student> students= studentRepo.findAll();
        model.addAttribute("Student", students);
        return "login";

    }

    @PostMapping("/login/add")
    public String Login(@RequestParam String password, @RequestParam String Fullname,@RequestParam String email, Model model){
        student students = new student(Fullname,email,password);
        studentRepo.save(students);
        return "redirect:/home";

    }


    @GetMapping("/signup")
    public String Signup(Model model){
        Iterable<student> students= studentRepo.findAll();
        model.addAttribute("student", students);
        return "signup";

    }
    @GetMapping("/signup/add")
    public String Signadd(Model model){
        Iterable<student> students= studentRepo.findAll();
        model.addAttribute("student", students);
        return "home2";

    }

    @PostMapping("/signup/add")
    public String SignPostAdd( @RequestParam String fullname,@RequestParam String email,@RequestParam String password, Model model){
        student students = new student(fullname,email,password);
        studentRepo.save(students);
        return "home2";

    }
}
package com.miguel.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title","Hola Mundo Spring Boot");
        model.addAttribute("name","Miguel");
        model.addAttribute("lastname","Nequiz");

       return "details";
    }

    /* Otra forma
    @GetMapping("/details")
    public String details(Map<String, Object> model){
        model.put("title","Hola Mundo Spring Boot");
        model.put("name","Miguel");
        model.put("lastname","Nequiz");

       return "details";
    } */
}

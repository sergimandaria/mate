package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainPage {

    @GetMapping("/page")
    public  String mainPage(){
        return "index";
    }

    @GetMapping("/info")
    public  String infoPage(){
        return "info";
    }

    @GetMapping("/students")
    public  String studentPage(){
        return "students";
    }
}

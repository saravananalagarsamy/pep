package com.pepinfotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
class HomeController {

    @GetMapping("/")
    String index(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        return "index";
    }
    

    @RequestMapping("/index")
    String indexPage(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        return "index";
    }
    
    @RequestMapping("/about")
    String about(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        return "about";
    }
    
    @RequestMapping("/services")
    String services(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        return "services";
    }
  
    @RequestMapping("/testing")
    String testing(Model model) {
        return "services";
    }
    
    @RequestMapping("/approach")
    String approach(Model model) {
        return "approach";
    }

    @RequestMapping("/contact")
    String contact(Model model) {
        return "contact";
    }
}
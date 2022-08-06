package com.thymeleaf.tutorial.controller;

import com.thymeleaf.tutorial.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/switch-case")
    public String switchExample(Model model) {
        User user = new User("Ramesh", "ramesh@gmail.com", "ADMIN");
        model.addAttribute("user", user);
        return "switch-case";
    }
}

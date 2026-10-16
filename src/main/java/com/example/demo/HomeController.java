
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/greet")
    public String greet(
            @RequestParam(defaultValue = "Student") String name,
            Model model) {

        model.addAttribute("message", "Hello, " + name + "!");
        return "index";
    }
}

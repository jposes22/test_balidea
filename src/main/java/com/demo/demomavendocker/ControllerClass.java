package com.demo.demomavendocker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerClass {

    @GetMapping("/")
    public String main(Model model) {
        return "index"; //view
    }
    @GetMapping("/hi")
    public String hi(Model model) {
        return "/index"; //view
    }
}

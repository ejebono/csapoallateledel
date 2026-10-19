package com.example.Szakdolgozat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/termek")
    public String termek() {
        return "termek";
    }

    @GetMapping("/elerhetoseg")
    public String elerhetoseg() {return "elerhetoseg";}

    @GetMapping("/fiok")
    public String fiok() {
        return "fiok";
    }
}
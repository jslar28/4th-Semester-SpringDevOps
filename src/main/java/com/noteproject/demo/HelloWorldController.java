package com.noteproject.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping ("/")
    public String index() {
        return "index";
    }

    @GetMapping ("/jakobsTest")
    public String jakobsTest() {
        return "jakobsTest";
    }
}

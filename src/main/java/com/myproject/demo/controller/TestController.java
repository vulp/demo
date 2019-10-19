package com.myproject.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public @ResponseBody
    ResponseEntity test() throws Exception {
        System.out.println("test");
        return new ResponseEntity("test123", HttpStatus.OK);
    }
}

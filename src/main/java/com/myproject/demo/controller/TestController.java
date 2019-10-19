package com.myproject.demo.controller;

import com.myproject.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public @ResponseBody
    ResponseEntity findAllTests() throws Exception {
        System.out.println("find all tests");
        return new ResponseEntity(testService.findAllTests(), HttpStatus.OK);
    }

    @PostMapping()
    public @ResponseBody
    ResponseEntity addTest() throws Exception {
        System.out.println("add test");
        return new ResponseEntity(testService.addTest(), HttpStatus.OK);
    }

}

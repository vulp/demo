package com.myproject.demo.controller;

import com.myproject.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    ResponseEntity test() throws Exception {
        System.out.println("test");
        return new ResponseEntity(testService.findAllTests(), HttpStatus.OK);
    }


}

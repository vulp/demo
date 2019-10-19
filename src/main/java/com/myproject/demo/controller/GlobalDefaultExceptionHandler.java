package com.myproject.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@ControllerAdvice
public class GlobalDefaultExceptionHandler  {

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ModelMap
    defaultErrorHandler(HttpServletRequest req, Exception e, HttpServletResponse res) throws Exception {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("url", req.getRequestURL());
        return modelMap;
    }
}

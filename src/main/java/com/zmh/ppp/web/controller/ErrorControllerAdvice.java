package com.zmh.ppp.web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorControllerAdvice {
    @ExceptionHandler(Exception.class)
    public String handlerException(Exception ex, Model model) {
        model.addAttribute("msg",ex.getMessage());
        return "error";
    }
}

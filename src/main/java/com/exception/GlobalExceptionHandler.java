package com.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    // 处理算术异常
    @ExceptionHandler(ArithmeticException.class)
    public String handleArithmeticException(Exception e, Model model) {
        model.addAttribute("errorMsg", "发生算术异常：" + e.getMessage());
        return "error";
    }

    // 处理其它异常
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model model) {
        model.addAttribute("errorMsg", "发生其它异常：" + e.getMessage());
        return "error";
    }
}
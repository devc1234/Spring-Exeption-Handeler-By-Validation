package com.example.demo.advise;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exeption.UserNotFoundException;

@RestControllerAdvice

public class ExceptionHandlerApp {



    @ExceptionHandler()
      public Map<String,String> handleException(MethodArgumentNotValidException exception){
          Map<String,String> errorMap = new HashMap<>();
          exception.getBindingResult().getFieldErrors().forEach(error  ->{

              errorMap.put(error.getField(),error.getDefaultMessage());
          });
        return errorMap;
      }
}
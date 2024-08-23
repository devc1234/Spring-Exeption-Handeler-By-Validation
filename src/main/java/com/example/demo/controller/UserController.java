package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserRequest;
import com.example.demo.entity.User;
import com.example.demo.exeption.UserNotFoundException;
import com.example.demo.servises.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAllUsersFromDb(){

      return   userService.getAllUserFromDB();
    }


    @GetMapping("/User/{id}")
    public User findUserById(@PathVariable int id){

        return   userService.getUserbyID(id);
    }


    @PostMapping("/insert")
    public User insertUser(@RequestBody @Valid UserRequest userRequest){

        return   userService.insertUser(userRequest);
    }
}
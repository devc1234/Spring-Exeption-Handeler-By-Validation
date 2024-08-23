package com.example.demo.servises;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserRequest;
import com.example.demo.entity.User;
import com.example.demo.exeption.UserNotFoundException;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {

     @Autowired
    private UserRepo userRepo;

     public User getUserbyID(int id ){
       return   userRepo.findById(id ).get();
     }


    public List<User> getAllUserFromDB( ){
        return   userRepo.findAll();
    }


    public User insertUser( UserRequest userRequest){
       User user =User.build(0,userRequest.getName(), userRequest.getAddress(), userRequest.getEmail(), userRequest.getAge(), userRequest.getSalary());
    return userRepo.save(user);

    }
}
package com.sam.controller;

import com.sam.dao.UserRepository;
import com.sam.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SamZhao on 2017/6/26.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/simple/{id}")
    public User findById(@PathVariable Long id){
        return userRepository.findOne(id);
    }
}

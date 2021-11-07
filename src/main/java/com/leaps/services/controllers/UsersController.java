package com.leaps.services.controllers;

import com.leaps.services.entities.User;
import com.leaps.services.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping(produces = "application/json")
    public List<User> fetchAllUsers() {
        return usersService.fetchAllUsers();
    }

}

package com.leaps.services.services;

import com.leaps.services.entities.User;
import com.leaps.services.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    public List<User> fetchAllUsers() {
        List<User> usersList = new ArrayList<>();
        Iterable<User> result = usersRepository.findAll();
        result.forEach(usersList::add);
        return usersList;
    }
}

package com.paraza.ts.ticketsystem.service;

import com.paraza.ts.ticketsystem.dao.UserRepository;
import com.paraza.ts.ticketsystem.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}

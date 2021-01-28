package com.southwind.service.impl;

import com.southwind.entity.User;
import com.southwind.repository.UserRepository;
import com.southwind.service.UserService;
import com.southwind.util.UUIDGenerator;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public Integer save(User user) {
        String userId = UUIDGenerator.getId();
        user.setId(userId);
        return userRepository.save(user);
    }

    public void deleteById(String id) {
        userRepository.deleteById(id);
    }

    public User findById(String id) {
        return userRepository.findById(id);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}

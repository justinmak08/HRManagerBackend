package com.southwind.service;

import com.southwind.entity.User;

public interface UserService {
    public Integer save(User user);
    public void deleteById(String id);
    public User findById(String id);
    public User findByUsername(String username);
}

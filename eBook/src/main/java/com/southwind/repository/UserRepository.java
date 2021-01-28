package com.southwind.repository;

import com.southwind.entity.User;

public interface UserRepository {
    public Integer save(User user);
    public void deleteById(String id);
    public User findById(String id);
    public User findByUsername(String username);
}

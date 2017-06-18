package com.prosta.service;

import java.util.List;

import com.prosta.model.User;

public interface UserService {
    public User findById(Long id);
    public User findByUsername(String username);
    public List<User> findAll ();
}

package com.project.Portfolio.service;

import com.project.Portfolio.model.User;

public interface IUserService {

    public User getUserById(Long id);

    public User updateUser(User user);
}

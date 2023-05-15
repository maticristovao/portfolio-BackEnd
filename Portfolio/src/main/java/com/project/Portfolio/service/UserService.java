package com.project.Portfolio.service;

import com.project.Portfolio.exceptions.ResourceNotFoundException;
import com.project.Portfolio.model.User;
import com.project.Portfolio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public User getUserById(Long id) {
        return userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }

    @Override
    public User updateUser(User updatedUser) {
        User existingUser = getUserById(1l);

        if (updatedUser.getName() != null) {
            existingUser.setName(updatedUser.getName());
        }
        if (updatedUser.getSurname() != null) {
            existingUser.setSurname(updatedUser.getSurname());
        }
        if (updatedUser.getEmail() != null) {
            existingUser.setEmail(updatedUser.getEmail());
        }
        if (updatedUser.getPhone() != null) {
            existingUser.setPhone(updatedUser.getPhone());
        }
        if (updatedUser.getAbout() != null) {
            existingUser.setAbout(updatedUser.getAbout());
        }
        if (updatedUser.getPhoto() != null) {
            existingUser.setPhoto(updatedUser.getPhoto());
        }
        if (updatedUser.getProvince_id() != 0) {
            existingUser.setProvince_id(updatedUser.getProvince_id());
        }
        User editedUser = userRepo.save(existingUser);
        return userRepo.save(editedUser);
    }
}

package com.endterm.scooterparkingapi.service;

import com.endterm.scooterparkingapi.model.User;
import com.endterm.scooterparkingapi.repository.UserRepository;
import com.endterm.scooterparkingapi.patterns.UserFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User createUserWithFactory(String type, String name, double rating) {
        User user = UserFactory.createUser(type, name, rating);
        return userRepository.save(user);
    }

    public User updateUser(Long id, User user) {
        User existing = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        existing.setName(user.getName());
        existing.setRating(user.getRating());

        return userRepository.save(existing);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}


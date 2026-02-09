package com.endterm.scooterparkingapi.controller;

import com.endterm.scooterparkingapi.model.User;
import com.endterm.scooterparkingapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // ================== GET ALL ==================
    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    // ================== CREATE ==================
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // ================== UPDATE ==================
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id,
                           @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    // ================== DELETE ==================
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}

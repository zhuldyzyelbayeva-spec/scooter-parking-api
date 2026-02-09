package com.endterm.scooterparkingapi.patterns;

import com.endterm.scooterparkingapi.model.User;

public class UserBuilder {

    private final User user = new User();

    public UserBuilder name(String name) {
        user.setName(name);
        return this;
    }

    public UserBuilder rating(double rating) {
        user.setRating(rating);
        return this;
    }

    public User build() {
        return user;
    }
}

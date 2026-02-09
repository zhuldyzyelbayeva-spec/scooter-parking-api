package com.endterm.scooterparkingapi.patterns;

import com.endterm.scooterparkingapi.model.User;

public class UserFactory {

    public static User createUser(String type, String name, double rating) {
        User user = new User();
        user.setName(name);
        user.setRating(rating);

        if ("VIP".equalsIgnoreCase(type)) {
            user.setRating(5.0);
        }

        return user;
    }
}

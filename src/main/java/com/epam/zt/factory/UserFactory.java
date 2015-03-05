package com.epam.zt.factory;

import com.epam.zt.entity.User;

import java.util.Random;

public class UserFactory {
    //private static final User[] users = new User[10];
    private static final Random RANDOM = new Random();
    private static final String[] userName = {"Vasya", "Petya", "Kolya"};

   /* static {
        for (int i = 0; i < users.length; i++) {
            User user = new User();
            user.setName(userName[RANDOM.nextInt(userName.length)]);
            user.setRole(RoleFactory.getRandomRole());
            users[i] = user;
        }
    }
*/
    public static User createUser() {
        User user = new User();
        user.setName(userName[RANDOM.nextInt(userName.length)]);
        user.setRole(RoleFactory.getRandomRole());
        return user;
    }

    /*public static User getRandomUser() {
        return users[RANDOM.nextInt(users.length)];
    }*/

}

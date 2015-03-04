package com.epam.zt.entity;

import java.util.Random;
import java.util.UUID;

public class RoleFactory {
    private static final Role ADMIN = new Role(new UUID(0, 1), "ADMIN");
    private static final Role GUEST = new Role(new UUID(0, 2), "GUEST");
    private static final Role AUTHOR = new Role(new UUID(0, 3), "AUTHOR");
    private static final Role[] roles = {ADMIN, AUTHOR, GUEST};
    private static final Random RANDOM = new Random();

    public static Role createRole(String roleName) {
        if (roleName.equals("ADMIN")) return ADMIN;
        if (roleName.equals("GUEST")) return GUEST;
        if (roleName.equals("AUTHOR")) return AUTHOR;
        return null;
    }

    public static Role getRandomRole() {
        return roles[RANDOM.nextInt(roles.length)];
    }
}

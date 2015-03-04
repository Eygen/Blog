package com.epam.zt.entity;

import java.util.UUID;

public class Role extends BaseEntity {

    private String name;

    public Role(UUID uuid, String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                '}';
    }
}

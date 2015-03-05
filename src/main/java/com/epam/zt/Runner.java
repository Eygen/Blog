package com.epam.zt;

import com.epam.zt.factory.*;

public class Runner {
    public static void main(String[] args) {
        System.out.println(RoleFactory.getRandomRole());
        System.out.println(UserFactory.createUser());
        System.out.println(BlogFactory.createBlog());
        System.out.println(PostFactory.createPost());
        System.out.println(TagFactory.createTag());
    }
}

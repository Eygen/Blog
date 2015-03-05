package com.epam.zt.factory;

import com.epam.zt.entity.Tag;

import java.util.Random;

public class TagFactory {
    private static final Random RANDOM = new Random();

    public static Tag createTag() {
        Tag tag = new Tag();
        //tag.setBlog(BlogFactory.createBlog());
        tag.setTitle("Title " + RANDOM.nextInt(10));
        tag.setPostsCount(RANDOM.nextInt(50));
        return tag;
    }
}

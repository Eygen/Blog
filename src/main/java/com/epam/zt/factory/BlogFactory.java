package com.epam.zt.factory;

import com.epam.zt.entity.Blog;
import com.epam.zt.entity.Post;
import com.epam.zt.entity.Tag;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BlogFactory {
    private static final Random RANDOM = new Random();
    private static List<Post> posts = new ArrayList<Post>();
    private static List<Tag> tags = new ArrayList<Tag>();

    public static Blog createBlog() {
        Blog blog = new Blog();
        blog.setAuthor(UserFactory.createUser());
        blog.setTitle("Title " + RANDOM.nextInt(10));
        blog.setDescription("Description " + RANDOM.nextInt(50));
        blog.setCreationDate(new Date(System.currentTimeMillis()));
        for (int i = 0; i < RANDOM.nextInt(10); i++) {
            posts.add(PostFactory.createPost());
            tags.add(TagFactory.createTag());
        }
        blog.setPostList(posts);
        blog.setTagList(tags);
        return blog;
    }
}

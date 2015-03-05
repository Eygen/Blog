package com.epam.zt.factory;

import com.epam.zt.entity.Comment;
import com.epam.zt.entity.Post;
import com.epam.zt.entity.Tag;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class PostFactory {
    private static final Random RANDOM = new Random();
    private static final List<Comment> comments = new ArrayList<Comment>();
    private static final List<Tag> tags = new ArrayList<Tag>();

    public static Post createPost() {
        Post post = new Post();
        post.setAuthor(UserFactory.createUser());
        post.setTitle("Title " + RANDOM.nextInt(10));
        post.setBody("Body");
        post.setCreationDate(new Date(System.currentTimeMillis()));
        post.setLikes(RANDOM.nextInt(100));
        for (int i = 0; i < RANDOM.nextInt(10); i++) {
            comments.add(CommentFactory.createComment());
            tags.add(TagFactory.createTag());
        }
        post.setCommentList(comments);
        post.setTagList(tags);
        //post.setBlog(BlogFactory.createBlog());
        post.setViews(RANDOM.nextInt(250));
        return post;
    }
}

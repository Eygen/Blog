package com.epam.zt.entity;

import java.util.List;

public class Author extends BaseEntity {
    List<Post> postList;
    List<Comment> commentList;
    int rate;
}

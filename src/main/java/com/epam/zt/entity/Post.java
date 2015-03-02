package com.epam.zt.entity;

import java.util.List;

public class Post extends Publication {
    int like;
    Author author;
    List<Comment> commentList;
}

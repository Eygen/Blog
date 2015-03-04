package com.epam.zt.entity;

import java.util.List;

public class Post extends Publication {
    int likes;
    int views;
    List<Comment> commentList;
}

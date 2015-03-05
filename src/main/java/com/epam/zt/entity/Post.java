package com.epam.zt.entity;

import java.util.List;

public class Post extends Publication {
    private Blog blog;
    private int views;
    private List<Comment> commentList;
    private List<Tag> tagList;

    @Override
    public String toString() {
        return "Post{" +
                "blog=" + blog +
                ", author=" + getAuthor() +
                ", title=" + getTitle() +
                ", body=" + getBody() +
                ", views=" + views +
                ", commentList=" + commentList +
                ", tagList=" + tagList +
                '}';
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }
}

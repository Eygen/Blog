package com.epam.zt.entity;

import java.util.Date;
import java.util.List;

public class Blog extends BaseEntity implements Comparable<Blog> {

    private User author;
    private String title;
    private String description;
    private Date creationDate;
    private List<Post> postList;
    private List<Tag> tagList;

    @Override
    public String toString() {
        return "Blog{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", postList=" + postList.size() +
                ", tagList=" + tagList.size() +
                '}';
    }



    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    @Override
    public int compareTo(Blog o) {
        return creationDate.compareTo(o.creationDate);
    }


}

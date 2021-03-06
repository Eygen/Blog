package com.epam.zt.entity;

import java.util.Date;

public abstract class Publication extends BaseEntity implements Comparable<Publication> {
    private User author;
    private String title;
    private String body;
    private Date creationDate;
    private int likes;

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public int compareTo(Publication o) {
        return creationDate.compareTo(o.creationDate);
    }
}

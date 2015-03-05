package com.epam.zt.entity;

public class Tag extends BaseEntity {
    private Blog blog;
    private int postsCount;
    private String title;

    @Override
    public String toString() {
        return "Tag{" +
                "blog=" + blog +
                ", postsCount=" + postsCount +
                ", title='" + title + '\'' +
                '}';
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

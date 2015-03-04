package com.epam.zt.entity;

import java.util.Date;
import java.util.List;

public class Blog implements Comparable<Blog> {

    private String title;
    private Date creationDate;
    private List<Post> postList;

    @Override
    public int compareTo(Blog o) {
        return creationDate.compareTo(o.creationDate);
    }


}

package com.epam.zt.entity;

import java.util.Date;

public abstract class Publication implements Comparable<Publication> {
    private int id;
    private String title;
    private String description;
    private String body;
    private Date creationDate;
    private User user;

    @Override
    public int compareTo(Publication o) {
        return creationDate.compareTo(o.creationDate);
    }
}

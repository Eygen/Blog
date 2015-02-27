package com.epam.zt.entity;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String login;
    private String password;
    private String email;
    private Date dateReg;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateReg() {
        return dateReg;
    }
}

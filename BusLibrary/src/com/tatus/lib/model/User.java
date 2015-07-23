package com.tatus.lib.model;

import java.util.Date;


public class User {
    
    private int usernameId;
    private String username;
    private String password;
    private int role;
    private Date dateUpdated;
    private Date dateCreated;

    public User() {
    }

    public User(int usernameId, String username, String password, int role, Date dateUpdated, Date dateCreated) {
        this.usernameId = usernameId;
        this.username = username;
        this.password = password;
        this.role = role;
        this.dateUpdated = dateUpdated;
        this.dateCreated = dateCreated;
    }

    public int getUsernameId() {
        return usernameId;
    }

    public void setUsernameId(int usernameId) {
        this.usernameId = usernameId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "User{" + "usernameId=" + usernameId + ", username=" + username + ", password=" + password + ", role=" + role + ", dateUpdated=" + dateUpdated + ", dateCreated=" + dateCreated + '}';
    }
    
    

}

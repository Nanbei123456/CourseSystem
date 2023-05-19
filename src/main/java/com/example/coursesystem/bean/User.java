package com.example.coursesystem.bean;

public class User {
    private String id;
    private String pwd;
    private String role;


    public User(String name, String pwd, String role) {
        this.id = name;
        this.pwd = pwd;
        this.role = role;
    }

    public User() {
    }
    
    public String getId() {
        return id;
    }
    public String getPwd() {
        return pwd;
    }

    public String getRole() {
        return role;
    }

    public void setId(String name) {
        this.id = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

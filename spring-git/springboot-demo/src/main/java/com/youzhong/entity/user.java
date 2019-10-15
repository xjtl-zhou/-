package com.youzhong.entity;

public class user {

    private int id;
    private int age;
    private  String name;

    private String username;

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public user(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public user(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public user() {
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

}

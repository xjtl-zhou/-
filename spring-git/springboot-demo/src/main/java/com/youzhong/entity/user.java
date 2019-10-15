package com.youzhong.entity;

public class user {

    private int id;
    private int age;
    private  String name;

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

package com.youzhong.entity;

public class user {

    private int id;
    private int age;
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public user(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public user() {
    }


}

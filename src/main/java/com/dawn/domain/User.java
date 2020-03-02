package com.dawn.domain;

import java.io.Serializable;

public class User implements Serializable {

    private Integer id;
    private String name;
    private Integer age;
    private String Info;

    public User() {
    }

    public User(String name, Integer age, String info) {
        this.name = name;
        this.age = age;
        Info = info;
    }

    public User(Integer id, String name, Integer age, String info) {
        this.id = id;
        this.name = name;
        this.age = age;
        Info = info;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Info='" + Info + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }
}

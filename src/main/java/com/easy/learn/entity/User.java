package com.easy.learn.entity;

import java.io.Serializable;

/**
 * @author noseparte
 * @link github.com/noseparte
 * @date 2020/12/8 - 19:19
 * @implSpec
 */
public class User implements Serializable {

    private String name;
    private int age;
    private long creatTime;

    public User(){}

    public User(String name, int age, long creatTime) {
        this.name = name;
        this.age = age;
        this.creatTime = creatTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(long creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", creatTime=" + creatTime +
                '}';
    }


}

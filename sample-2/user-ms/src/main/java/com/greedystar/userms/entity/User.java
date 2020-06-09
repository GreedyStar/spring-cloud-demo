package com.greedystar.userms.entity;

import java.io.Serializable;

/**
 * Author GreedyStar
 * Date   2020-6-9
 */
public class User implements Serializable {
    /**
     * ID
     */
    private int id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 手机号
     */
    private String phone;

    public User() {
    }

    public User(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

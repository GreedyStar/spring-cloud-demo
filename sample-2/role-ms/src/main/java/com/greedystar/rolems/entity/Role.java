package com.greedystar.rolems.entity;

import java.io.Serializable;

/**
 * Author GreedyStar
 * Date   2020-6-9
 */
public class Role implements Serializable {
    /**
     * ID
     */
    private int id;
    /**
     * 角色名称
     */
    private String name;

    public Role() {
    }

    public Role(int id, String name) {
        this.id = id;
        this.name = name;
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
}

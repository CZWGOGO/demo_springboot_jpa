package com.example.demo_springboot_jpa.pojo;

import javax.persistence.*;

/**
 * Created by CZWGOGO on 2019/9/29 20:23
 */
@Entity
@Table(name = "category_")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
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
package com.example.demo_springboot_jpa.dao;

import com.example.demo_springboot_jpa.pojo.Category;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by CZWGOGO on 2019/9/29 19:45
 */
    public interface CategoryDAO extends JpaRepository<Category,Integer> {

    }

package com.ccf.local.test.bean;

import lombok.Data;

import java.util.Map;

/**
 * @author chengchf
 * @date 2019/4/2 8:42 PM
 */
@Data
public class Student {

    private String name;

    private int age;

    private Map<String, String> map;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

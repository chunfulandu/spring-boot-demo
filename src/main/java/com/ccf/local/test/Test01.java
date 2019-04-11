package com.ccf.local.test;

import com.ccf.local.test.bean.Student;
import org.springframework.beans.BeanUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chengchf
 * @date 2019/4/2 8:41 PM
 */
public class Test01 {

    public static void main(String[] args) {
        Student stu = new Student("zs", 10);
        Map<String, String> map = new HashMap<>();
        map.put("1", "2");
        stu.setMap(map);
        Student stu1 = new Student();
        BeanUtils.copyProperties(stu, stu1);
        System.out.println(stu1.toString());
    }
}

package com.ccf.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author chengchf
 * @date 2019/4/10 6:52 PM
 */
@SpringBootApplication
@ImportResource(locations= {"classpath:application-demo.xml"})
public class DurationProfilerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DurationProfilerApplication.class, args);
    }
}

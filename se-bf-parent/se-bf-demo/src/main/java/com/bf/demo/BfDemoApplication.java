package com.bf.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BfDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BfDemoApplication.class, args);
    }

}

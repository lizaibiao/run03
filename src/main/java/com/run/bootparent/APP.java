package com.run.bootparent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class APP {

    public static void main(String[] args) {

        System.out.println(1);///jdiajsidah
        SpringApplication.run(APP.class, args);
    }


}

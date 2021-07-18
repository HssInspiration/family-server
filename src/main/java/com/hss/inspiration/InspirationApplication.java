package com.hss.inspiration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hss.inspiration.mapper")
public class InspirationApplication {

    public static void main(String[] args) {
        SpringApplication.run(InspirationApplication.class, args);
    }

}

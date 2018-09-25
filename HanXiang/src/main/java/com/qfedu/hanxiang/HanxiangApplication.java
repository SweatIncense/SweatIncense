package com.qfedu.hanxiang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/qfedu/hanxiang/mapper")
public class HanxiangApplication {

    public static void main(String[] args) {
        SpringApplication.run(HanxiangApplication.class, args);
    }
}

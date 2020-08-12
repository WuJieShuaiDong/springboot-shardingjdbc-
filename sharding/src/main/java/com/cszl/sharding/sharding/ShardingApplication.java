package com.cszl.sharding.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.cszl.sharding.sharding.mapper")
public class ShardingApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(ShardingApplication.class, args);
//    }

}

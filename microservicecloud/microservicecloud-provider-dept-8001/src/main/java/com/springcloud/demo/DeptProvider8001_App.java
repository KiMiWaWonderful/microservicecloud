package com.springcloud.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
@ComponentScan(value="*.*.controller")
@EntityScan(value="*.*.entity")
@ComponentScan(value="*.*.service")
@ComponentScan(value="*.*.serviceImpl")
@MapperScan(value="*.*.dao")

@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient
@SpringBootApplication//(exclude = DataSourceAutoConfiguration.class)
public class DeptProvider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}

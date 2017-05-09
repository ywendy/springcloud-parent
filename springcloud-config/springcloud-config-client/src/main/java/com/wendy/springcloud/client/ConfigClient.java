package com.wendy.springcloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/9.
 */
@SpringBootApplication
@RestController
public class ConfigClient {

    @Value("${std.url}")
    String url;

    @RequestMapping("/")
    String hello(){
        return "hello:"+url;
    }


    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class,args);
    }

}

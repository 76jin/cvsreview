package com.cvsreview;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ranian129@gmail.com on 2019-03-12
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@SpringBootApplication
@MapperScan(basePackages = {
        "com.cvsreview.notice.persistence"
})
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}

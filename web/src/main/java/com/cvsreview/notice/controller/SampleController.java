package com.cvsreview.notice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ranian129@gmail.com on 2019-03-14
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello world!";
    }
}

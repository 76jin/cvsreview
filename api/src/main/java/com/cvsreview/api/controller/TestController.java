package com.cvsreview.api.controller;

import com.cvsreview.api.service.ApiSampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ranian129@gmail.com on 2019-03-12
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@RestController
@RequestMapping("api/test")
public class TestController {

    @Autowired
    private ApiSampleService apiSampleService;

    @GetMapping
    public String hello() {
        return "Hello world in TestController";
    }

    @GetMapping("showSampleText")
    public String getSampleText() {
        return apiSampleService.getSampleText();
    }
}

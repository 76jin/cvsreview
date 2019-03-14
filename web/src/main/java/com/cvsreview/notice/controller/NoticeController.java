package com.cvsreview.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ranian129@gmail.com on 2019-03-13
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@Controller
@RequestMapping("/notice")
public class NoticeController {

    @GetMapping("/")
    public String noticeMain() {
        System.out.println("/notice called.");
        return "hello";
    }

    @GetMapping("hello")
    public String hello(Model model) {
        System.out.println("/notice/hello called.");
        model.addAttribute("data", "hello notice!");
        return "hello2";
    }
}

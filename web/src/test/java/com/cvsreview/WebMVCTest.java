package com.cvsreview;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.cvsreview.notice.controller.SampleController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.io.UnsupportedEncodingException;

/**
 * Created by ranian129@gmail.com on 2019-03-14
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
@AutoConfigureMybatis
public class WebMVCTest {

    @Autowired
    MockMvc mock;

    @Test
    public void testHello() throws Exception {
        mock.perform(get("/sample/hello"))
                .andExpect(content().string("Hello world!"));
    }

    @Test
    public void testHelloPrint() throws Exception {
        MvcResult result = mock.perform(get("/sample/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello world!"))
                .andReturn();

        System.out.println(result.getResponse().getContentAsString());
    }
}

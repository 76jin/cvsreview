package com.cvsreview;

import static org.junit.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import com.cvsreview.notice.persistence.TimeMapper;
import lombok.extern.java.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ranian129@gmail.com on 2019-03-13
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest()
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@Log
public class SampleTest {

    @Autowired
    TimeMapper timeMapper;

    @Test
    public void testExist() {
        assertNotNull("okok");

        assertThat("ok", is("ok"));

//        log.info("### good");
    }

    @Test
    public void getTimeMapper() {
        System.out.println("TIME:" + timeMapper.getTimeXML());
        System.out.println("######");
        System.out.println("TIME:" + timeMapper.getTime());
//        log.info("####");
//        log.info("TIME:" + timeMapper.getTime());
    }
}

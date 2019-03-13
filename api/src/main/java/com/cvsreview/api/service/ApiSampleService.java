package com.cvsreview.api.service;

import com.cvsreview.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ranian129@gmail.com on 2019-03-12
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@Service
public class ApiSampleService {

    @Autowired
    private SampleService sampleService;

    public String getSampleText() {
        return sampleService.getSampleText();
    }
}

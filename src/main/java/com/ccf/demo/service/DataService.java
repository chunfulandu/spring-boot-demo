package com.ccf.demo.service;

import com.ccf.demo.repository.DataDao;
import com.ccf.demo.util.ThreadUtils;
import com.chunfulandu.duration.annotation.Profiler;
import com.chunfulandu.duration.annotation.RootProfiler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chengchf
 * @date 2019/4/10 7:01 PM
 */
@Service
public class DataService {

    @Autowired
    private DataDao dataRepository;

//    @Profiler(true)
    @RootProfiler
    public void queryAndUpdate() {
        dataRepository.query();
        ThreadUtils.randomSleep();
        dataRepository.update();
        dataRepository.asyncTestMethod();
    }
}

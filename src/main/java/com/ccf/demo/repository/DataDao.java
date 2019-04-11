package com.ccf.demo.repository;

import com.ccf.demo.util.ThreadUtils;
import com.chunfulandu.duration.annotation.Profiler;
import org.springframework.stereotype.Service;

/**
 * @author chengchf
 * @date 2019/4/10 7:00 PM
 */
@Service
public class DataDao {

    @Profiler
    public void update() {
        ThreadUtils.randomSleep();
    }

    @Profiler
    public void query() {
        ThreadUtils.randomSleep();
    }

    /**
     * 对于链路上的异步代码不适用
     *
     */
    public void asyncTestMethod() {
        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

package com.ccf.demo.util;

import org.apache.commons.lang.math.RandomUtils;

/**
 * @author chengchf
 * @date 2019/4/10 6:42 PM
 */
public class ThreadUtils {

    private ThreadUtils() {
    }

    public static void randomSleep() {
        try {
            Thread.sleep(RandomUtils.nextInt(100));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

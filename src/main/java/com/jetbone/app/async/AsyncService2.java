package com.jetbone.app.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Chris
 * @date 2021-08-23
 */
@Service
public class AsyncService2 {

    @Async("taskExecutor")
    public String sync1(String input) throws InterruptedException {
        System.out.println("当前线程：" + Thread.currentThread().getName() + " , input: " + input);
        Thread.sleep(3000);
        return "sync1";
    }

    @Async("taskExecutor")
    public String sync2(String input) throws InterruptedException {
        System.out.println("当前线程：" + Thread.currentThread().getName() + " , input: " + input);
        Thread.sleep(3000);
        return "sync2";
    }

    @Async("taskExecutor")
    public String sync3(String input) throws InterruptedException {
        System.out.println("当前线程：" + Thread.currentThread().getName() + " , input: " + input);
        Thread.sleep(3000);
        return "sync3";
    }

    @Async("taskExecutor")
    public String sync4(String input) throws InterruptedException {
        System.out.println("当前线程：" + Thread.currentThread().getName() + " , input: " + input);
        Thread.sleep(3000);
        return "sync14";
    }
}

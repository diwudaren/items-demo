package com.qr.foundation.lock.servce.impl;

import org.springframework.stereotype.Service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class SellTickleServiceImpl implements Runnable{

    //100张票
    private int tickets = 100;

    @Override
    public void run() {

        Lock lock = new ReentrantLock();
        while (tickets > 0) {
            lock.lock();
            synchronized (this) {
                try {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets-- + "张票");
                    }
                } finally {
                    lock.unlock();
                }
            }
        }
    }

//    @Override
//    public void run() {
//
//        while (tickets > 0) {
//            synchronized (this) {
//                if (tickets > 0) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets-- + "张票");
//                }
//            }
//        }
//    }
}

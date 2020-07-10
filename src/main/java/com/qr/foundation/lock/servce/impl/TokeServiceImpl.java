package com.qr.foundation.lock.servce.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokeServiceImpl {

    @Autowired
    private SellTickleServiceImpl tokeServiceRunnable;


    public static void main(String[] args) {
        SellTickleServiceImpl sellTickleService = new SellTickleServiceImpl();
        for (int i = 1; i<=3; i++){
            new Thread(sellTickleService,"窗口" + i).start();
        }
    }


    public void sellTickle(){


        for (int i = 1; i<=3; i++){
            new Thread(tokeServiceRunnable,"窗口" + i).start();
        }
    }

}

package com.qr.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public void date() throws BrokenBarrierException, InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2000);
        for (int i =0;i<=2000;i++){
            cyclicBarrier.await();//线程等待
            System.out.println("开始执行"+i+cyclicBarrier);
        }
    }
}

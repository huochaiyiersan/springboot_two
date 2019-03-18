package com.springboot.hui.timer.springtime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Schedule {

    @Scheduled(fixedRate = 2000)//代表每2秒执行一次
    public void task() {
        System.out.println("启动定时任务:" + new Date());
    }
}
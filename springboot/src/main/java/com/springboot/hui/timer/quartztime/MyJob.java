package com.springboot.hui.timer.quartztime;


import com.springboot.hui.timer.quartztime.sevice.UserAddService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
public class MyJob implements Job {
    @Autowired
    private UserAddService userService;
    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        System.out.println("========quartz 测试==========");
        userService.add();

    }
}

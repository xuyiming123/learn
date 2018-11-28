package base.定时任务;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component // 此注解必加
@EnableScheduling // 此注解必加
public class ScheduledJob {

    private static Logger log = LoggerFactory.getLogger(ScheduledJob.class);


    @Scheduled(fixedDelay = 5000)
    public void send() throws JobExecutionException {

        log.info("----------------\n"
                + "调用定时任务成功!"
                + "\n---------------");
    }
}

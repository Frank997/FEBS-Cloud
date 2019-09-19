package cc.mrbird.febs.server.system.runner;

import cc.mrbird.febs.common.entity.constant.FebsServerConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class StartedUpRunner implements ApplicationRunner {

    @Autowired
    private ConfigurableApplicationContext context;

    @Value("${spring.application.name:'" + FebsServerConstant.FEBS_SERVER_SYSTEM + "'}")
    private String applicationName;

    @Override
    public void run(ApplicationArguments args) {
        if (context.isActive()) {
            log.info(" +-+-+-+-+-+-+-+-+");
            log.info(" |c|o|m|p|l|e|t|e|");
            log.info(" +-+-+-+-+-+-+-+-+");
            log.info("{} 启动完毕，时间：{}", applicationName, LocalDateTime.now());
        }
    }
}

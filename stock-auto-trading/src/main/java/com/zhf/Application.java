package com.zhf;

import com.zhf.common.config.FebsProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.zhf.*.dao")
@EnableConfigurationProperties({FebsProperties.class})
@EnableCaching
@EnableAsync
public class Application {

    private static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("《《《《《《 stock-auto-trading started up successfully at {} {} 》》》》》》", LocalDate.now(), LocalTime.now());
    }
}

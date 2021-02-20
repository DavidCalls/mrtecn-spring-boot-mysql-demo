package com.mrtecn.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * 定义队列
 */
@Configuration
public class QueueConf {
    @Bean(name = "message")
    public Queue queueMessage(){
        return new Queue( "someQueue" );
    }
}

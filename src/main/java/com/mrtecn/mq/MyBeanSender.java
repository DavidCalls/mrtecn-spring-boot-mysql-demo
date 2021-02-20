package com.mrtecn.mq;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
public class MyBeanSender {
    @Autowired
    private AmqpTemplate template;

    public void send(String message) {
        template.convertAndSend( "someQueue", "hello ,rabbit" + message );
    }
}

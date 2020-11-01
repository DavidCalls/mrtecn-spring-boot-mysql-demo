package com.mrtecn.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * 接手消息的bean
 */
@Component
public class MyBeanReceiver {
    //@RabbitListener( queues = "someQueue" )
    public void processMessage( String content ) {
        System.out.println( "hello this is content receiver" + content );
    }
}

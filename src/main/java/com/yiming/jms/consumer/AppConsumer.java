package com.yiming.jms.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yiming on 2017/7/16.
 */
public class AppConsumer {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
//        new AppConsumer().start();
    }


}

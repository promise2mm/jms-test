package com.yiming.jms.producer;

import com.yiming.jms.BaseApp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yiming on 2017/7/16.
 */
public class AppProducer extends BaseApp {


    public static void main(String[] args) {
        new AppProducer().start();
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            getProducerService().sendMessage("hello topic[" + i + "].");
        }
        ((ClassPathXmlApplicationContext) getProducerContext()).close();
    }

}

package com.yiming.jms;

import com.yiming.jms.consumer.AConsumerMessageListener;
import com.yiming.jms.consumer.BConsumerMessageListener;
import com.yiming.jms.producer.ProducerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yiming on 2017/7/16.
 */
public class BaseApp {
    ApplicationContext producerContext = new ClassPathXmlApplicationContext("producer.xml");
    ApplicationContext consumerContext = new ClassPathXmlApplicationContext("consumer.xml");
    ProducerService producerService = (ProducerService) producerContext.getBean("producerService");
    AConsumerMessageListener aConsumerMessageListener = (AConsumerMessageListener) consumerContext.getBean("aConsumerMessageListener");
    BConsumerMessageListener bConsumerMessageListener = (BConsumerMessageListener) consumerContext.getBean("bConsumerMessageListener");

    public static void main(String[] args) {
    }

    public AConsumerMessageListener getaConsumerMessageListener() {
        return aConsumerMessageListener;
    }

    public BConsumerMessageListener getbConsumerMessageListener() {
        return bConsumerMessageListener;
    }

    public ApplicationContext getConsumerContext() {
        return consumerContext;
    }

    public ApplicationContext getProducerContext() {
        return producerContext;
    }

    public ProducerService getProducerService() {
        return producerService;
    }
}

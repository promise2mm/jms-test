package com.yiming.jms.test;

import com.yiming.jms.producer.ProducerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.Destination;

/**
 * Created by yiming on 2017/7/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/consumer.xml")
public class JMSTest {

    @Autowired
    private ProducerService producerService;

    @Autowired
    @Qualifier("queueDestination")
    private Destination queueDestination;

    @Autowired
    @Qualifier("topicDestination")
    private Destination topicDestination;

    @Test
    public void testQueue() {
        //queue模式 - 两个消费者均分消息
        for (int i = 0; i < 10; i++) {
            producerService.sendMessage("[" + i + "] hello queue jms.");
        }
    }

    @Test
    public void testTopic() {
        //topic模式 - pus/sub方式 所有消费者广播接受消息
        for (int i = 0; i < 10; i++) {
            producerService.sendMessage("[" + i + "] hello topic jms.");
        }
    }


}

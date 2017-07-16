package com.yiming.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by yiming on 2017/7/16.
 */
public class BConsumerMessageListener implements MessageListener {

    public void onMessage(Message message) {
        if (message instanceof TextMessage) {
            try {
                System.out.println("b接收到文本消息消息:" + ((TextMessage) message).getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        } else {
            try {
                System.out.println("b接收到" + message.getJMSType() + "类型消息:" + message.toString());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}

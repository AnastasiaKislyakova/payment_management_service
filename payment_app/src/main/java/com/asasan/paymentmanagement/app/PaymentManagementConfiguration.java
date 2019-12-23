package com.asasan.paymentmanagement.app;

import com.asasan.ordermanagement.queue.ChangeStatusQueue;
import com.asasan.ordermanagement.queue.RabbitMQChangeStatusQueue;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Configuration
public class PaymentManagementConfiguration {
    @Bean
    public ChangeStatusQueue changeStatusQueue() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        return new RabbitMQChangeStatusQueue(channel);
    }
}

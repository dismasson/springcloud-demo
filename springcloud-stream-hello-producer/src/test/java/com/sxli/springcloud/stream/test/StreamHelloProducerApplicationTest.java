package com.sxli.springcloud.stream.test;

import com.sxli.springcloud.stream.ISenderService;
import com.sxli.springcloud.stream.StreamHelloProducerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StreamHelloProducerApplication.class)
public class StreamHelloProducerApplicationTest {

    @Autowired
    private ISenderService senderService;

    @Test
    public void contextLoads() {
        String msg = "hello stream";
        Message<String> message = MessageBuilder.withPayload(msg).build();
        this.senderService.sender().send(message);
    }
}

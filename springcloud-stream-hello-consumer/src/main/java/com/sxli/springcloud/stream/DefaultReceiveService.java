package com.sxli.springcloud.stream;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(IReceiveService.class)
public class DefaultReceiveService {

    @StreamListener("stream.hello.exchange")
    public void receiveHandler1(String msg) {
        System.out.println("receive :" + msg);
    }
}

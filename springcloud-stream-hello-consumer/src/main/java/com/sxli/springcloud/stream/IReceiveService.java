package com.sxli.springcloud.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface IReceiveService {

    @Input("stream.hello.exchange")
    SubscribableChannel receive();

}

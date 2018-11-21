package com.sxli.springcloud.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface ISenderService {

    @Output("stream.hello.exchange")
    SubscribableChannel sender();
}

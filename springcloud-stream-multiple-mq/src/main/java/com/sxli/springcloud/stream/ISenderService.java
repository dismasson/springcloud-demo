package com.sxli.springcloud.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface ISenderService {

    final String OUTPUT = "outputProduct";

    @Output(OUTPUT)
    SubscribableChannel sender();
}

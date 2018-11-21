package com.sxli.springcloud.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface IReceiveService {

    final static String INPUT = "inputProduct";

    @Input(INPUT)
    SubscribableChannel receive();

}

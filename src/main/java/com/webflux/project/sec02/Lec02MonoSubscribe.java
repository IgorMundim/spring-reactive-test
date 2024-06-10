package com.webflux.project.sec02;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

public class Lec02MonoSubscribe {
    private static final Logger log = LoggerFactory.getLogger(Lec02MonoSubscribe.class);

    public static void main(String[] args){
        var mono = Mono.just("mundim");
        mono.subscribe(
                i -> log.info("recived: {}", i),
                err -> log.error("error",err),
                () -> log.info("completed"),
                subscription -> subscription.request(1)
        );

    }
}

package com.webflux.project.sec02;

import com.webflux.project.common.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

/*
    Creating publisher is a lightweight operation.
    Executing time-consuming business logic should be delayed
 */
public class Lec09PublisherCreateVsExecution {
    private static final Logger log = LoggerFactory.getLogger(Lec09PublisherCreateVsExecution.class);

    public  static void  main(String[] args) {
        getName()
                .subscribe(Util.subscriber());
    }
    private static Mono<String> getName(){
        log.info("entered the method");
        return Mono.fromSupplier(() -> {
            log.info("generation name");
            Util.sleepSeconds(3);
            return Util.faker().name().firstName();
        });
    }
}

package com.webflux.project.sec02;

import com.webflux.project.common.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.util.List;


public class Lec06MonoFromSumpplier {
    private static final Logger log = LoggerFactory.getLogger(Lec06MonoFromSumpplier.class);

    public  static void  main(String[] args) {

        var list = List.of(1,2,3);

        Mono.fromSupplier(() -> sum(list))
                .subscribe(Util.subscriber());
    }

    private static  int sum(List<Integer> list){
        log.info("finding me the sum of {}", list);
        return  list.stream().mapToInt(a -> a).sum();
    }
}

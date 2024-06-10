package com.webflux.project.sec02;

import com.webflux.project.common.Util;
import reactor.core.publisher.Mono;

public class Lec04MonoEmptyError {
    public  static void  main(String[] args){
        getUserName(1).subscribe(Util.subscriber());
    }

    private static Mono<String> getUserName(int userId) {
        return switch (userId){
            case 1 -> Mono.just("sam");
            case 2 -> Mono.empty();
            default -> Mono.error(new RuntimeException("invalid input"));
        };
    }
}

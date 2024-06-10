package com.webflux.project.sec02;


import com.webflux.project.sec01.subscriber.SubscriberImpl;
import reactor.core.publisher.Mono;

public class Lec02MonoJust {
    public static void main(String[] args){
        var mono = Mono.just("mundim");
        var subscriber = new SubscriberImpl();
        mono.subscribe(subscriber);
        subscriber.getSubscription().request(10);
        subscriber.getSubscription().request(10);

    }
}

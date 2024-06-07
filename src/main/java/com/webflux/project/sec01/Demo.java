package com.webflux.project.sec01;

import com.webflux.project.sec01.publisher.PublisherImpl;
import com.webflux.project.sec01.subscriber.SubscriberImpl;

public class Demo {
    public static void main(String[] args) throws Exception{
     demo2();
    }
     private static void demo1(){
         var publisher = new PublisherImpl();
         var subscriber = new SubscriberImpl();
         publisher.subscribe(subscriber);
     }
     private static void demo2(){
         var publisher = new PublisherImpl();
         var subscriber = new SubscriberImpl();
         publisher.subscribe(subscriber);
         subscriber.geSubscription().request(3);
     }
}

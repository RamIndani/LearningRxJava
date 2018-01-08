package com.ramnivas.home;

import rx.Observable;
/**
 * Created by ramnivasindani on 1/7/18.
 */
public class HelloRxWorld {
    private static Observable<String> RxHelloWorldObservable =
            Observable.create(subscriber -> {subscriber.onNext("Hello World");});

    public static void main(String[] args) {
        RxHelloWorldObservable
                .subscribe(greetings -> System.out.println(greetings),
                        error -> System.out.println(error.getMessage()));
    }
}

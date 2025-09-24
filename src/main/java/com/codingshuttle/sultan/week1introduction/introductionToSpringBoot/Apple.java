package com.codingshuttle.sultan.week1introduction.introductionToSpringBoot;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Apple {

    public void eatApple() {
        System.out.println("Eating apple ");
    }
    @PostConstruct
    void callThisBeforeAppleIsUsed(){
        System.out.println("Creating the apple before use");
    }
    @PreDestroy
    void callThisBeforeDestroy(){
        System.out.println("Destroying the Apple bean");
    }
}

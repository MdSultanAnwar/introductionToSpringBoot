package com.codingshuttle.sultan.week1introduction.introductionToSpringBoot;


import org.springframework.stereotype.Component;

@Component
public class DevDB implements DB {

    public String getData(){
        return "Dev Data";
    }
}

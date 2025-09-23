package com.codingshuttle.sultan.week1introduction.introductionToSpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

    @Autowired
    Apple obj;

    public static void main(String[] args) {
        SpringApplication.run(IntroductionToSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args)  throws Exception{
        obj.eatApple();
    }
}

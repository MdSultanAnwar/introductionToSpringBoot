package com.codingshuttle.sultan.week1introduction.introductionToSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ProdDB implements DB {

     public String getData(){
        return "Prod Data";
    }
}

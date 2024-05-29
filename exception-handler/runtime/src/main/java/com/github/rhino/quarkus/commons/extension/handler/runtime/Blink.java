package com.github.rhino.quarkus.commons.extension.handler.runtime;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Blink {

    public void blinkTest(){
        System.out.println("TEST EXTENSION!!!!     :)");
    }
}

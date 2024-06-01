package com.github.rhino.quarkus.commons.extension.handler.runtime;

import jakarta.ws.rs.ext.Provider;

@Provider
public class Blink {

    public void blinkTest(){
        System.out.println("TEST EXTENSION!!!!     :)");
    }
}

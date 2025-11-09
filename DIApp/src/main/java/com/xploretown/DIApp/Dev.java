package com.xploretown.DIApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {


    @Autowired              // Field Injection
    private Computer comp;

    public void build(){
        System.out.println("Working on the project");
        comp.compile();
    };
}

package com.example.demoSecond;

import org.springframework.stereotype.Component;

@Component
// @Primary
public class Laptop implements Computer{
    @Override
    public void compile(){
        System.out.println("Compiling Code with Laptop!");
    }
}

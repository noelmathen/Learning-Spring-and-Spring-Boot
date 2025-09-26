package com.example.demoSecond;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    //Field Injection
    @Autowired 
    @Qualifier("laptop")
    private Computer comp;


    // //Constructor Injection
    // public Dev(Laptop comp){
    //     this.comp = comp;
    // }


    // //Setter Injection
    // @Autowired
    // public void setLaptop(Laptop comp){
    //     this.comp = comp;
    // }

    public void  build(){
        comp.compile();

        System.out.println("Working on a project!");
    }
}

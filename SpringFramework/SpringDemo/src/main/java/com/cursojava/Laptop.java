package com.cursojava;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public Laptop() {
        System.out.println("Laptop Obj Created");
    }

    @Override
    public void compile(){

        System.out.println("Compiling using Laptop");
    }
}

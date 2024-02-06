package com.cursojava;

public class Laptop implements Computer{
    public Laptop() {
        System.out.println("Laptop Obj Created");
    }

    @Override
    public void compile(){

        System.out.println("Compiling using Laptop");
    }
}

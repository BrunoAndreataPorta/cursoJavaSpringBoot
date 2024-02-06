package com.cursojava;

public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop Obj Created");
    }

    @Override
    public void compile(){

        System.out.println("Compiling using Desktop");
    }
}

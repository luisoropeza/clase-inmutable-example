package com.example;

public final class ClaseInmutableB {
    private final int a;
    private final int b;

    public ClaseInmutableB(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA(){
        return this.a;
    }

    public int getB(){
        return this.b;
    }
}

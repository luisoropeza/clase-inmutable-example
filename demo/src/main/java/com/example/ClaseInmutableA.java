package com.example;

public final class ClaseInmutableA {
    private final int a;
    private final String b;
    private final ClaseInmutableB c;
    private final ClaseMutable d;
    
    public ClaseInmutableA(int a, String b, ClaseInmutableB c, ClaseMutable d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA(){
        return this.a;
    }

    public String getB(){
        return this.b;
    }

    public ClaseInmutableB getC(){
        return this.c;
    }

    // public ClaseMutable getD(){
    //     return this.d;
    // }

    public ClaseMutable getD(){
        return new ClaseMutable(d.getA(), d.getB());
    }
}

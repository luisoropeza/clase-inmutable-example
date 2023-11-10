package com.example;

public class Main {
    public static void main(String[] args) {
        ClaseMutable mutable = new ClaseMutable(5, 6);
        System.out.println(mutable.getA());
        System.out.println(mutable.getB());
        System.out.println("----------------");
        ClaseInmutableB inmutableB = new ClaseInmutableB(3, 4);
        System.out.println(inmutableB.getA());
        System.out.println(inmutableB.getB());
        System.out.println("----------------");
        ClaseInmutableA inmutableA = new ClaseInmutableA(1, "2", inmutableB, mutable);
        System.out.println(inmutableA.getA());
        System.out.println(inmutableA.getB());
        
        System.out.println(inmutableA.getC().getA());
        System.out.println(inmutableA.getC().getB());
        
        inmutableA.getD().setA(7);
        inmutableA.getD().setB(8);
        System.out.println(inmutableA.getD().getA());
        System.out.println(inmutableA.getD().getB());
    }
}
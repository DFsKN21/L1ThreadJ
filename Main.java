package com.company;

public class Main {

    public static void main(String[] args) {

        BreakT breakThread = new BreakT();

        new SomeT(1, breakThread).start();
        new SomeT(2, breakThread).start();
        //new SomeT(3, breakThread).start();
        new Thread(breakThread).start();
    }
}

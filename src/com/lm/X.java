package com.lm;

import java.util.Scanner;

public class X {

    private int x = 0;

    public X(int x) {
        this.x = x;
    }

    public void x() {
        System.out.println("**********");
        System.out.println("Multiplication table for " + this.x + ":");
        for (int x = 1; x <= 12; x++) {
            System.out.println(this.x + " x " + x + " = " + this.x * x);
        }
    }
}


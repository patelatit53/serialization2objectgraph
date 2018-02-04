package com.rajeshpatkar;

import java.io.Serializable;

public class C1 implements Serializable {

    private int a;
    private int b;
    private C2 obj2;

    public C1(int a, int b, C2 obj2) {
        this.a = a;
        this.b = b;
        this.obj2 = obj2;
    }

    public C1() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public C2 getObj2() {
        return obj2;
    }

    public void setObj2(C2 obj2) {
        this.obj2 = obj2;
    }

    @Override
    public String toString() {
        return "C1{" + "a=" + a + ", b=" + b + ", obj2=" + obj2 + '}';
    }
}


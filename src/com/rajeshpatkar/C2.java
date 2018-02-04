package com.rajeshpatkar;

import java.io.Serializable;

public class C2 implements Serializable {

    int c;
    int d;

    public C2(int c, int d) {
        this.c = c;
        this.d = d;
    }

    public C2() {
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "C2{" + "c=" + c + ", d=" + d + '}';
    }

}
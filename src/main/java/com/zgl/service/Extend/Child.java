package com.zgl.service.Extend;

public class Child extends Father{
    public int a = 2;

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Father f = new Child();
        System.out.println(f.a);
        System.out.println(((Child) f).a);
        f.setA(3);
        System.out.println(((Child) f).a);
        System.out.println(f.a);
    }
}

package com.zgl.service;

public abstract class TestAbstractClassMethodInherit {
    //静态常量
    long MAX_SPEED = 500*1024*1024;
    public int a = 0;
    //抽象方法
    public abstract void in();
    public abstract void out();
    //默认方法
    public void start(){
        System.out.println("开始");
    }
    public void stop(){
        System.out.println("结束");
    }
    //静态方法
    public static void show(){
        System.out.println("USB 3.0可以同步全速的进行读写操作");
    }
}

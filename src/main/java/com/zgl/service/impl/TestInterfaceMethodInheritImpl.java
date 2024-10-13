package com.zgl.service.impl;

import com.zgl.service.TestInterfaceMethodInherit;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

@Service
public class TestInterfaceMethodInheritImpl implements TestInterfaceMethodInherit {
    @Override
    public void in() {
        System.out.println("TestInterfaceMethodInheritImpl" + "in()");
    }

    @Override
    public void out() {

    }

    @Override
    public void start() {
        TestInterfaceMethodInherit.super.start();
    }

    @Override
    public void stop() {
        TestInterfaceMethodInherit.super.stop();
    }


}

package com.zgl.service.impl;

import com.zgl.service.TestAbstractClassMethodInherit;
import org.springframework.stereotype.Service;

@Service
public class TestAbstractClassMethodInheritImpl extends TestAbstractClassMethodInherit {
    public int a = 1;
    @Override
    public void in() {
        System.out.println(super.a);
        System.out.println(a);
    }

    @Override
    public void out() {

    }

}

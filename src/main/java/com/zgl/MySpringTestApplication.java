package com.zgl;

import com.zgl.service.impl.TestAbstractClassMethodInheritImpl;
import com.zgl.service.impl.TestInterfaceMethodInheritImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringTestApplication {

    public static TestInterfaceMethodInheritImpl testInterfaceMethodInherit = new TestInterfaceMethodInheritImpl();

    public static TestAbstractClassMethodInheritImpl testAbstractClassMethodInherit = new TestAbstractClassMethodInheritImpl();

    public static void main(String[] args) {
        SpringApplication.run(MySpringTestApplication.class, args);
//        testInterfaceMethodInherit.in();
        testAbstractClassMethodInherit.in();
    }

}

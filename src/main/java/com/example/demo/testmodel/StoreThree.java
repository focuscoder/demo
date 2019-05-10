package com.example.demo.testmodel;

import org.springframework.beans.factory.InitializingBean;

public class StoreThree implements StoreInterface, InitializingBean {

    @Override
    public void executeQuery() {
        System.out.print("i am store 3");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        StoreFactory.registerPunish("three",this);
    }
}

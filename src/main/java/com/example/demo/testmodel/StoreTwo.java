package com.example.demo.testmodel;

import org.springframework.beans.factory.InitializingBean;

public class StoreTwo implements StoreInterface, InitializingBean {

    @Override
    public void executeQuery() {
        System.out.print("i am store 2");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        StoreFactory.registerPunish("two",this);
        this.defaultMethod();
    }
}

package com.example.demo.testmodel;

import org.springframework.beans.factory.InitializingBean;

public class StoreOne implements StoreInterface, InitializingBean {


    @Override
    public void executeQuery() {
        System.out.print("i am store 1");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        StoreFactory.registerPunish("one",this);
    }
}

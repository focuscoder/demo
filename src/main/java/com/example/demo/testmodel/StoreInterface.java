package com.example.demo.testmodel;

public interface StoreInterface {

    void executeQuery();

    default String defaultMethod () {
        return "";
    }
}

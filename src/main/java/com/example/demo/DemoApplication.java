package com.example.demo;

import com.example.demo.testmodel.StoreFactory;
import com.example.demo.testmodel.StoreInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.*;

@EnableEurekaServer
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    public int test() throws Exception{
        this.clone();

        Hashtable hashSet = new Hashtable();
        HashMap hashSets = new HashMap<>();
        List list = new LinkedList<>();
        return 0;
    }


    public static void getStores(String flag) {
        StoreInterface storeInterface = StoreFactory.getPunish(flag);
        storeInterface.executeQuery();
    }



}

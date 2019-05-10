package com.example.demo.testmodel;

import java.util.HashMap;
import java.util.Map;


/**
 * 代码重构：用工厂+策略模式优化过多的if else代码块
 * 最近在工作中优化了一段冗余的if else代码块，感觉对设计模式的理解和运用很有帮助，所以分享出来。
 * 鉴于原代码会涉及到公司的隐私，因此就不贴出来了。下面以更加通俗易懂的案例来解析。假如写一个针
 * 对员工上班不遵守制度做相应惩罚的程序，比如，上班迟到：罚100；上班睡觉：罚1000；上班早退：警告；
 * 上班玩游戏：严重警告；上班谈恋爱：开除等
 */


public class StoreFactory {

    private static Map<String,StoreInterface> punishMap = new HashMap<>();

    private StoreFactory() {}

    private static final StoreInterface EMPTY = new EmptyPunish();

    //获取
    public static StoreInterface getPunish(String state) {
        StoreInterface result = punishMap.get(state);
        return result == null ? EMPTY : result;

    }

    //将各种情况抽象出的对象注册保存到Map这里
    static void registerPunish(String state,StoreInterface o){
        punishMap.put(state, o);
    }

    private static class EmptyPunish implements StoreInterface {
        @Override
        public void executeQuery() {
            // Empty class
        }
    }




}
package com.luo.redis.operate;

import redis.clients.jedis.Jedis;

/**
 * 操作String类型
 */
public class OperateString {
    public static void main(String[] args){


    }

    /**
     * 获取值
     * @param jedis
     * @param key
     * @return
     */
    public static String get(Jedis jedis, String key){
        String value = jedis.get(key);
        return value;
    }

    public static void set(Jedis jedis, String key, String value){
        jedis.set(key, value);
        return;
    }

    /**
     * 与set的区别：key存在则不执行任何操作
     * @param jedis
     * @param key
     * @param value
     */
    public static void setOrDiscard(Jedis jedis, String key, String value){
        jedis.setnx(key, value);
        return;
    }

    public static void append(Jedis jedis, String key, String value){
        jedis.append(key, value);
        return;
    }

    public static void delete(Jedis jedis, String key){
        jedis.del(key);
        return;
    }


}

package com.luo.redis.connect;

import redis.clients.jedis.Jedis;

public class SimpleConnect {
    public static void main(String[] args){
        Jedis jedis = new Jedis("172.31.100.69",6379,10000);
        jedis.auth("123456");
        int i = 0;
        try{
            long startTime = System.currentTimeMillis();
            while(true){
                long endTime = System.currentTimeMillis();
                if(endTime - startTime >=1000){// 当大于等于1000毫秒（相当于1秒）时，结束操作
                    break;
                }
                i++;
                jedis.set("test-"+i,i+"-value");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            jedis.close();
        }
        System.out.println("redis每秒操作：" + i + "次！");
    }
}

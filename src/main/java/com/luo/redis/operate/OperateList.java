package com.luo.redis.operate;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;

public class OperateList {
    public static void main(){
        Jedis jedis = new Jedis("localhost",6379);
        jedis.auth("123456");
        //在key对应list的头部添加多个值
        jedis.lpush("language","java", "scala", "python");
        String temp = jedis.lpop("language");//从key对应的list返回第一个元素并移除


//        HashMap map = new HashMap(130,0.75F);
//        map.put("name","sunny");

    }




    public static void lpush(Jedis jedis, List<String > list){

    }
}

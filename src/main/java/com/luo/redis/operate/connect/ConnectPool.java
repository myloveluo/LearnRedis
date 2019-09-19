package com.luo.redis.operate.connect;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class ConnectPool {
    public static void main(){
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        //最大空闲数
        poolConfig.setMaxIdle(50);
        //最大连接数
        poolConfig.setMaxTotal(100);
        //最大等待毫秒数
        poolConfig.setMaxWaitMillis(20000);
        //创建连接池
        JedisPool pool = new JedisPool(poolConfig,"localhost",6379);
        //从连接池中获取单个连接
        Jedis jedis = pool.getResource();
       // jedis.auth("123456");//如果需要密码
    }


}

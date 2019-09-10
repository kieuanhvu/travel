package com.hitex.travel.cache.redis;

import com.hitex.travel.config.CommonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
/**
 *
 * @author MaiPH
 */
@Component
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS,scopeName = "prototype")
public class RedisFactory {
    
    @Autowired
    private JedisSentinelPool connectionPool;
    
    @Autowired
    private CommonConfig config;
    private Jedis jedis;
    
    private Jedis getConnection(){
       Jedis jedis = connectionPool.getResource();
       jedis.auth(config.getAuthen());
       return jedis;
    }
    
    public Jedis select(int index){
        jedis = getConnection(); 
        jedis.select(index);
        return jedis;
    }
}

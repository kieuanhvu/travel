package com.hitex.travel.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

/**
 *
 * @author MaiPH
 */
@Configuration
public class RedisConfig {

    @Autowired
    private CommonConfig config;
    
    @Bean
    public JedisPoolConfig poolConfig() {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(config.getMaxConnection());
        return poolConfig;
    }

    @Bean
    public JedisSentinelPool jedisSentinelPool() {
//        String[] ipRedis = config.getSenitels();
//        Set<String> sentinels = new HashSet<>();
//        sentinels.addAll(Arrays.asList(ipRedis));
//        JedisSentinelPool jedisSentinelPool = new JedisSentinelPool(config.getMasterName(), sentinels, poolConfig());
//        return jedisSentinelPool;
        return null;
    }
}

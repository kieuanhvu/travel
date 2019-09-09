package com.hitex.travel.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author MaiPH
 */
@Configuration
@Getter
public class CommonConfig {

    @Value("${server.port}")
    private int port;
    
    // Redis 
    @Value("${application.redis.senitel}")
    private String[] senitels;
    
    @Value("${application.redis.masterName}")
    private String masterName;
    
    @Value("${application.redis.maxConection}")
    private int maxConnection;
    
    @Value("${application.redis.authen}")
    private String authen;
    
}

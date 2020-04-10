package com.donlevy.springcloud.consumer01.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : mawei
 * @description : ribbon配置
 * @since : 2020-04-10 14:41
 */
@Configuration
public class RibbonCfg {

    @Bean("normalRestTemplate")
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}

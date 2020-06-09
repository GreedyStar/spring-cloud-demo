package com.greedystar.userms.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author GreedyStar
 * Date   2020-6-9
 */
@Configuration
public class RibbonConfig {

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }

}

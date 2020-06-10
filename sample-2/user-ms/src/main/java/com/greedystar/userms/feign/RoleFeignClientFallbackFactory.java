package com.greedystar.userms.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Author GreedyStar
 * Date   2020-6-10
 */
@Component
public class RoleFeignClientFallbackFactory implements FallbackFactory<RoleFeignClient> {

    @Override
    public RoleFeignClient create(Throwable throwable) {
        RoleFeignClient roleFeignClient = () -> throwable.getMessage();
        return roleFeignClient;
    }

}

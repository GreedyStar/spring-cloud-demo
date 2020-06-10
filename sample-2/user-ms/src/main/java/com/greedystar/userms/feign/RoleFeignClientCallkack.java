package com.greedystar.userms.feign;

import org.springframework.stereotype.Component;

/**
 * Author GreedyStar
 * Date   2020-6-10
 */
@Component
public class RoleFeignClientCallkack implements RoleFeignClient {

    @Override
    public Object findRoleList() {
        return "findRoleList : inavailable";
    }

}

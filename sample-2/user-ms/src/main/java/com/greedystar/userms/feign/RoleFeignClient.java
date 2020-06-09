package com.greedystar.userms.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author GreedyStar
 * Date   2020-6-9
 */

@FeignClient(name = "role-ms")
//@RibbonClient(name = "role-ms", configuration = RibbonConfig.class)
public interface RoleFeignClient {

    @RequestMapping(value = {"/roles"}, method = RequestMethod.GET)
    Object findRoleList();

}

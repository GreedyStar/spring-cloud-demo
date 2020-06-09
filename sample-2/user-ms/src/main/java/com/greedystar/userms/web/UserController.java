package com.greedystar.userms.web;

import com.greedystar.userms.feign.RoleFeignClient;
import com.greedystar.userms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author GreedyStar
 * Date   2020-6-9
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleFeignClient roleFeignClient;

    @RequestMapping("/users")
    public Object users() {
        return userService.findUserList();
    }

    @RequestMapping("/roles")
    public Object roles() {
        return roleFeignClient.findRoleList();
    }

}

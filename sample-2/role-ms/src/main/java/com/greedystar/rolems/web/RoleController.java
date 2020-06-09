package com.greedystar.rolems.web;

import com.greedystar.rolems.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author GreedyStar
 * Date   2020-6-9
 */
@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/roles")
    public Object roles() {
        System.out.println(new SimpleDateFormat("yyyy-MM-hh HH:mm:ss").format(new Date()) + " request path: /roles");
        return roleService.findRoleList();
    }

}

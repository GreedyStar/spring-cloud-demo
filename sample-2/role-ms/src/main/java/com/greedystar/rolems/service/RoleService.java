package com.greedystar.rolems.service;

import com.greedystar.rolems.entity.Role;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author GreedyStar
 * Date   2020-6-9
 */
@Service
public class RoleService {
    private List<Role> roles = new ArrayList<>();

    public RoleService() {
        for (int i = 1; i < 5; i++) {
            roles.add(new Role(i, "ROLE_USER_" + i));
        }
    }

    public List<Role> findRoleList() {
        return roles;
    }

}
